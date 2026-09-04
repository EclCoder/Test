package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.NetworkInfo;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import xn.c0;
import xn.g;
import xn.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
class BitmapHunter implements Runnable {
    Action action;
    List<Action> actions;
    final Cache cache;
    final Request data;
    final Dispatcher dispatcher;
    Exception exception;
    int exifOrientation;
    Future<?> future;
    final String key;
    Picasso.LoadedFrom loadedFrom;
    final int memoryPolicy;
    int networkPolicy;
    final Picasso picasso;
    Picasso.Priority priority;
    final RequestHandler requestHandler;
    Bitmap result;
    int retryCount;
    final int sequence = SEQUENCE_GENERATOR.incrementAndGet();
    final Stats stats;
    private static final Object DECODE_LOCK = new Object();
    private static final ThreadLocal<StringBuilder> NAME_BUILDER = new ThreadLocal<StringBuilder>() { // from class: com.squareup.picasso.BitmapHunter.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public StringBuilder initialValue() {
            return new StringBuilder("Picasso-");
        }
    };
    private static final AtomicInteger SEQUENCE_GENERATOR = new AtomicInteger();
    private static final RequestHandler ERRORING_HANDLER = new RequestHandler() { // from class: com.squareup.picasso.BitmapHunter.2
        @Override // com.squareup.picasso.RequestHandler
        public boolean canHandleRequest(Request request) {
            return true;
        }

        @Override // com.squareup.picasso.RequestHandler
        public RequestHandler.Result load(Request request, int i10) {
            throw new IllegalStateException("Unrecognized type of request: " + request);
        }
    };

    BitmapHunter(Picasso picasso, Dispatcher dispatcher, Cache cache, Stats stats, Action action, RequestHandler requestHandler) {
        this.picasso = picasso;
        this.dispatcher = dispatcher;
        this.cache = cache;
        this.stats = stats;
        this.action = action;
        this.key = action.getKey();
        this.data = action.getRequest();
        this.priority = action.getPriority();
        this.memoryPolicy = action.getMemoryPolicy();
        this.networkPolicy = action.getNetworkPolicy();
        this.requestHandler = requestHandler;
        this.retryCount = requestHandler.getRetryCount();
    }

    static Bitmap applyCustomTransformations(List<Transformation> list, Bitmap bitmap) {
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            final Transformation transformation = list.get(i10);
            try {
                Bitmap bitmapTransform = transformation.transform(bitmap);
                if (bitmapTransform == null) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Transformation ");
                    sb2.append(transformation.key());
                    sb2.append(" returned null after ");
                    sb2.append(i10);
                    sb2.append(" previous transformation(s).\n\nTransformation list:\n");
                    Iterator<Transformation> it = list.iterator();
                    while (it.hasNext()) {
                        sb2.append(it.next().key());
                        sb2.append('\n');
                    }
                    Picasso.HANDLER.post(new Runnable() { // from class: com.squareup.picasso.BitmapHunter.4
                        @Override // java.lang.Runnable
                        public void run() {
                            throw new NullPointerException(sb2.toString());
                        }
                    });
                    return null;
                }
                if (bitmapTransform == bitmap && bitmap.isRecycled()) {
                    Picasso.HANDLER.post(new Runnable() { // from class: com.squareup.picasso.BitmapHunter.5
                        @Override // java.lang.Runnable
                        public void run() {
                            throw new IllegalStateException("Transformation " + transformation.key() + " returned input Bitmap but recycled it.");
                        }
                    });
                    return null;
                }
                if (bitmapTransform != bitmap && !bitmap.isRecycled()) {
                    Picasso.HANDLER.post(new Runnable() { // from class: com.squareup.picasso.BitmapHunter.6
                        @Override // java.lang.Runnable
                        public void run() {
                            throw new IllegalStateException("Transformation " + transformation.key() + " mutated input Bitmap but failed to recycle the original.");
                        }
                    });
                    return null;
                }
                i10++;
                bitmap = bitmapTransform;
            } catch (RuntimeException e10) {
                Picasso.HANDLER.post(new Runnable() { // from class: com.squareup.picasso.BitmapHunter.3
                    @Override // java.lang.Runnable
                    public void run() {
                        throw new RuntimeException("Transformation " + transformation.key() + " crashed with exception.", e10);
                    }
                });
                return null;
            }
        }
        return bitmap;
    }

    private Picasso.Priority computeNewPriority() {
        Picasso.Priority priority = Picasso.Priority.LOW;
        List<Action> list = this.actions;
        boolean z10 = (list == null || list.isEmpty()) ? false : true;
        Action action = this.action;
        if (action == null && !z10) {
            return priority;
        }
        if (action != null) {
            priority = action.getPriority();
        }
        if (z10) {
            int size = this.actions.size();
            for (int i10 = 0; i10 < size; i10++) {
                Picasso.Priority priority2 = this.actions.get(i10).getPriority();
                if (priority2.ordinal() > priority.ordinal()) {
                    priority = priority2;
                }
            }
        }
        return priority;
    }

    static Bitmap decodeStream(q0 q0Var, Request request) throws IOException {
        g gVarC = c0.c(q0Var);
        boolean zIsWebPFile = Utils.isWebPFile(gVarC);
        boolean z10 = request.purgeable;
        BitmapFactory.Options optionsCreateBitmapOptions = RequestHandler.createBitmapOptions(request);
        boolean zRequiresInSampleSize = RequestHandler.requiresInSampleSize(optionsCreateBitmapOptions);
        if (zIsWebPFile) {
            byte[] bArrL0 = gVarC.l0();
            if (zRequiresInSampleSize) {
                BitmapFactory.decodeByteArray(bArrL0, 0, bArrL0.length, optionsCreateBitmapOptions);
                RequestHandler.calculateInSampleSize(request.targetWidth, request.targetHeight, optionsCreateBitmapOptions, request);
            }
            return BitmapFactory.decodeByteArray(bArrL0, 0, bArrL0.length, optionsCreateBitmapOptions);
        }
        InputStream inputStreamS0 = gVarC.S0();
        if (zRequiresInSampleSize) {
            MarkableInputStream markableInputStream = new MarkableInputStream(inputStreamS0);
            markableInputStream.allowMarksToExpire(false);
            long jSavePosition = markableInputStream.savePosition(UserVerificationMethods.USER_VERIFY_ALL);
            BitmapFactory.decodeStream(markableInputStream, null, optionsCreateBitmapOptions);
            RequestHandler.calculateInSampleSize(request.targetWidth, request.targetHeight, optionsCreateBitmapOptions, request);
            markableInputStream.reset(jSavePosition);
            markableInputStream.allowMarksToExpire(true);
            inputStreamS0 = markableInputStream;
        }
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamS0, null, optionsCreateBitmapOptions);
        if (bitmapDecodeStream != null) {
            return bitmapDecodeStream;
        }
        throw new IOException("Failed to decode stream.");
    }

    static BitmapHunter forRequest(Picasso picasso, Dispatcher dispatcher, Cache cache, Stats stats, Action action) {
        Request request = action.getRequest();
        List<RequestHandler> requestHandlers = picasso.getRequestHandlers();
        int size = requestHandlers.size();
        for (int i10 = 0; i10 < size; i10++) {
            RequestHandler requestHandler = requestHandlers.get(i10);
            if (requestHandler.canHandleRequest(request)) {
                return new BitmapHunter(picasso, dispatcher, cache, stats, action, requestHandler);
            }
        }
        return new BitmapHunter(picasso, dispatcher, cache, stats, action, ERRORING_HANDLER);
    }

    static int getExifRotation(int i10) {
        switch (i10) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    static int getExifTranslation(int i10) {
        return (i10 == 2 || i10 == 7 || i10 == 4 || i10 == 5) ? -1 : 1;
    }

    private static boolean shouldResize(boolean z10, int i10, int i11, int i12, int i13) {
        if (!z10) {
            return true;
        }
        if (i12 == 0 || i10 <= i12) {
            return i13 != 0 && i11 > i13;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x027a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:61:0x0210  */
    /* JADX WARN: Code duplicated, block: B:98:0x0276  */
    static Bitmap transformResult(Request request, Bitmap bitmap, int i10) {
        int i11;
        int i12;
        boolean z10;
        int i13;
        int i14;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        int i15;
        int i16;
        float f18;
        float f19;
        float f20;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        Bitmap bitmapCreateBitmap;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        boolean z11 = request.onlyScaleDown;
        Matrix matrix = new Matrix();
        if (request.needsMatrixTransform() || i10 != 0) {
            int iFloor = request.targetWidth;
            int iFloor2 = request.targetHeight;
            float f21 = request.rotationDegrees;
            if (f21 != 0.0f) {
                double d10 = f21;
                double dCos = Math.cos(Math.toRadians(d10));
                double dSin = Math.sin(Math.toRadians(d10));
                if (request.hasRotationPivot) {
                    matrix.setRotate(f21, request.rotationPivotX, request.rotationPivotY);
                    float f22 = request.rotationPivotX;
                    double d11 = 1.0d - dCos;
                    float f23 = request.rotationPivotY;
                    double d12 = (((double) f22) * d11) + (((double) f23) * dSin);
                    double d13 = (((double) f23) * d11) - (((double) f22) * dSin);
                    int i24 = request.targetWidth;
                    double d14 = (((double) i24) * dCos) + d12;
                    double d15 = (((double) i24) * dSin) + d13;
                    int i25 = request.targetHeight;
                    double d16 = ((((double) i24) * dCos) + d12) - (((double) i25) * dSin);
                    i11 = width;
                    double d17 = (((double) i24) * dSin) + d13 + (((double) i25) * dCos);
                    i12 = height;
                    double d18 = d12 - (((double) i25) * dSin);
                    double d19 = (((double) i25) * dCos) + d13;
                    double dMax = Math.max(d18, Math.max(d16, Math.max(d12, d14)));
                    double dMin = Math.min(d18, Math.min(d16, Math.min(d12, d14)));
                    double dMax2 = Math.max(d19, Math.max(d17, Math.max(d13, d15)));
                    double dMin2 = Math.min(d19, Math.min(d17, Math.min(d13, d15)));
                    int iFloor3 = (int) Math.floor(dMax - dMin);
                    iFloor2 = (int) Math.floor(dMax2 - dMin2);
                    iFloor = iFloor3;
                    z10 = z11;
                } else {
                    i11 = width;
                    i12 = height;
                    matrix.setRotate(f21);
                    int i26 = request.targetWidth;
                    double d20 = ((double) i26) * dCos;
                    double d21 = ((double) i26) * dSin;
                    int i27 = request.targetHeight;
                    double d22 = (((double) i26) * dCos) - (((double) i27) * dSin);
                    double d23 = (((double) i26) * dSin) + (((double) i27) * dCos);
                    double d24 = -(((double) i27) * dSin);
                    double d25 = ((double) i27) * dCos;
                    z10 = z11;
                    double dMax3 = Math.max(d24, Math.max(d22, Math.max(0.0d, d20)));
                    double dMin3 = Math.min(d24, Math.min(d22, Math.min(0.0d, d20)));
                    double dMax4 = Math.max(d25, Math.max(d23, Math.max(0.0d, d21)));
                    double dMin4 = Math.min(d25, Math.min(d23, Math.min(0.0d, d21)));
                    iFloor = (int) Math.floor(dMax3 - dMin3);
                    iFloor2 = (int) Math.floor(dMax4 - dMin4);
                }
            } else {
                i11 = width;
                i12 = height;
                z10 = z11;
            }
            if (i10 != 0) {
                int exifRotation = getExifRotation(i10);
                int exifTranslation = getExifTranslation(i10);
                if (exifRotation != 0) {
                    matrix.preRotate(exifRotation);
                    if (exifRotation == 90 || exifRotation == 270) {
                        matrix = matrix;
                        matrix = matrix;
                        int i28 = iFloor2;
                        iFloor2 = iFloor;
                        iFloor = i28;
                    }
                } else {
                    matrix = matrix;
                }
                matrix = matrix;
                if (exifTranslation != 1) {
                    matrix.postScale(exifTranslation, 1.0f);
                }
            } else {
                matrix = matrix;
            }
            if (request.centerCrop) {
                if (iFloor != 0) {
                    i15 = i11;
                    f18 = iFloor / i15;
                    i16 = i12;
                } else {
                    i15 = i11;
                    i16 = i12;
                    f18 = iFloor2 / i16;
                }
                if (iFloor2 != 0) {
                    f19 = iFloor2;
                    f20 = i16;
                } else {
                    f19 = iFloor;
                    f20 = i15;
                }
                float f24 = f19 / f20;
                if (f18 > f24) {
                    int iCeil = (int) Math.ceil(i16 * (f24 / f18));
                    int i29 = request.centerCropGravity;
                    if ((i29 & 48) == 48) {
                        i18 = 0;
                    } else {
                        i18 = (i29 & 80) == 80 ? i16 - iCeil : (i16 - iCeil) / 2;
                    }
                    i17 = iCeil;
                    f24 = iFloor2 / iCeil;
                } else {
                    if (f18 < f24) {
                        int iCeil2 = (int) Math.ceil(i15 * (f18 / f24));
                        int i30 = request.centerCropGravity;
                        if ((i30 & 3) == 3) {
                            i19 = 0;
                        } else {
                            i19 = (i30 & 5) == 5 ? i15 - iCeil2 : (i15 - iCeil2) / 2;
                        }
                        i20 = i19;
                        i15 = iCeil2;
                        i17 = i16;
                        f18 = iFloor / iCeil2;
                        z10 = z10;
                        i18 = 0;
                    } else {
                        f18 = f24;
                        i17 = i16;
                        i18 = 0;
                    }
                    if (shouldResize(z10, i15, i16, iFloor, iFloor2)) {
                        matrix.preScale(f18, f24);
                    }
                    i21 = i18;
                    i22 = i20;
                    i13 = i15;
                    i23 = i17;
                }
                i20 = 0;
                if (shouldResize(z10, i15, i16, iFloor, iFloor2)) {
                    matrix.preScale(f18, f24);
                }
                i21 = i18;
                i22 = i20;
                i13 = i15;
                i23 = i17;
            } else {
                boolean z12 = z10;
                i13 = i11;
                i14 = i12;
                if (request.centerInside) {
                    if (iFloor != 0) {
                        f14 = iFloor;
                        f15 = i13;
                    } else {
                        f14 = iFloor2;
                        f15 = i14;
                    }
                    float f25 = f14 / f15;
                    if (iFloor2 != 0) {
                        f16 = iFloor2;
                        f17 = i14;
                    } else {
                        f16 = iFloor;
                        f17 = i13;
                    }
                    float f26 = f16 / f17;
                    if (f25 >= f26) {
                        f25 = f26;
                    }
                    if (shouldResize(z12, i13, i14, iFloor, iFloor2)) {
                        matrix.preScale(f25, f25);
                    }
                } else if ((iFloor != 0 || iFloor2 != 0) && (iFloor != i13 || iFloor2 != i14)) {
                    if (iFloor != 0) {
                        f10 = iFloor;
                        f11 = i13;
                    } else {
                        f10 = iFloor2;
                        f11 = i14;
                    }
                    float f27 = f10 / f11;
                    if (iFloor2 != 0) {
                        f12 = iFloor2;
                        f13 = i14;
                    } else {
                        f12 = iFloor;
                        f13 = i13;
                    }
                    float f28 = f12 / f13;
                    if (shouldResize(z12, i13, i14, iFloor, iFloor2)) {
                        matrix.preScale(f27, f28);
                    }
                }
            }
            bitmapCreateBitmap = Bitmap.createBitmap(bitmap, i22, i21, i13, i23, matrix, true);
            if (bitmapCreateBitmap != bitmap) {
                return bitmap;
            }
            bitmap.recycle();
            return bitmapCreateBitmap;
        }
        i13 = width;
        i14 = height;
        i23 = i14;
        i22 = 0;
        i21 = 0;
        bitmapCreateBitmap = Bitmap.createBitmap(bitmap, i22, i21, i13, i23, matrix, true);
        if (bitmapCreateBitmap != bitmap) {
            return bitmap;
        }
        bitmap.recycle();
        return bitmapCreateBitmap;
    }

    static void updateThreadName(Request request) {
        String name = request.getName();
        StringBuilder sb2 = NAME_BUILDER.get();
        sb2.ensureCapacity(name.length() + 8);
        sb2.replace(8, sb2.length(), name);
        Thread.currentThread().setName(sb2.toString());
    }

    void attach(Action action) {
        boolean z10 = this.picasso.loggingEnabled;
        Request request = action.request;
        if (this.action == null) {
            this.action = action;
            if (z10) {
                List<Action> list = this.actions;
                if (list == null || list.isEmpty()) {
                    Utils.log("Hunter", "joined", request.logId(), "to empty hunter");
                    return;
                } else {
                    Utils.log("Hunter", "joined", request.logId(), Utils.getLogIdsForHunter(this, "to "));
                    return;
                }
            }
            return;
        }
        if (this.actions == null) {
            this.actions = new ArrayList(3);
        }
        this.actions.add(action);
        if (z10) {
            Utils.log("Hunter", "joined", request.logId(), Utils.getLogIdsForHunter(this, "to "));
        }
        Picasso.Priority priority = action.getPriority();
        if (priority.ordinal() > this.priority.ordinal()) {
            this.priority = priority;
        }
    }

    boolean cancel() {
        List<Action> list;
        Future<?> future;
        return this.action == null && ((list = this.actions) == null || list.isEmpty()) && (future = this.future) != null && future.cancel(false);
    }

    void detach(Action action) {
        boolean zRemove;
        if (this.action == action) {
            this.action = null;
            zRemove = true;
        } else {
            List<Action> list = this.actions;
            zRemove = list != null ? list.remove(action) : false;
        }
        if (zRemove && action.getPriority() == this.priority) {
            this.priority = computeNewPriority();
        }
        if (this.picasso.loggingEnabled) {
            Utils.log("Hunter", "removed", action.request.logId(), Utils.getLogIdsForHunter(this, "from "));
        }
    }

    Action getAction() {
        return this.action;
    }

    List<Action> getActions() {
        return this.actions;
    }

    Request getData() {
        return this.data;
    }

    Exception getException() {
        return this.exception;
    }

    String getKey() {
        return this.key;
    }

    Picasso.LoadedFrom getLoadedFrom() {
        return this.loadedFrom;
    }

    int getMemoryPolicy() {
        return this.memoryPolicy;
    }

    Picasso getPicasso() {
        return this.picasso;
    }

    Picasso.Priority getPriority() {
        return this.priority;
    }

    Bitmap getResult() {
        return this.result;
    }

    Bitmap hunt() {
        Bitmap bitmapTransformResult;
        if (MemoryPolicy.shouldReadFromMemoryCache(this.memoryPolicy)) {
            bitmapTransformResult = this.cache.get(this.key);
            if (bitmapTransformResult != null) {
                this.stats.dispatchCacheHit();
                this.loadedFrom = Picasso.LoadedFrom.MEMORY;
                if (this.picasso.loggingEnabled) {
                    Utils.log("Hunter", "decoded", this.data.logId(), "from cache");
                }
                return bitmapTransformResult;
            }
        } else {
            bitmapTransformResult = null;
        }
        int i10 = this.retryCount == 0 ? NetworkPolicy.OFFLINE.index : this.networkPolicy;
        this.networkPolicy = i10;
        RequestHandler.Result resultLoad = this.requestHandler.load(this.data, i10);
        if (resultLoad != null) {
            this.loadedFrom = resultLoad.getLoadedFrom();
            this.exifOrientation = resultLoad.getExifOrientation();
            bitmapTransformResult = resultLoad.getBitmap();
            if (bitmapTransformResult == null) {
                q0 source = resultLoad.getSource();
                try {
                    Bitmap bitmapDecodeStream = decodeStream(source, this.data);
                    try {
                        source.close();
                    } catch (IOException unused) {
                    }
                    bitmapTransformResult = bitmapDecodeStream;
                } catch (Throwable th2) {
                    try {
                        source.close();
                    } catch (IOException unused2) {
                    }
                    throw th2;
                }
            }
        }
        if (bitmapTransformResult != null) {
            if (this.picasso.loggingEnabled) {
                Utils.log("Hunter", "decoded", this.data.logId());
            }
            this.stats.dispatchBitmapDecoded(bitmapTransformResult);
            if (this.data.needsTransformation() || this.exifOrientation != 0) {
                synchronized (DECODE_LOCK) {
                    try {
                        if (this.data.needsMatrixTransform() || this.exifOrientation != 0) {
                            bitmapTransformResult = transformResult(this.data, bitmapTransformResult, this.exifOrientation);
                            if (this.picasso.loggingEnabled) {
                                Utils.log("Hunter", "transformed", this.data.logId());
                            }
                        }
                        if (this.data.hasCustomTransformations()) {
                            bitmapTransformResult = applyCustomTransformations(this.data.transformations, bitmapTransformResult);
                            if (this.picasso.loggingEnabled) {
                                Utils.log("Hunter", "transformed", this.data.logId(), "from custom transformations");
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (bitmapTransformResult != null) {
                    this.stats.dispatchBitmapTransformed(bitmapTransformResult);
                }
            }
        }
        return bitmapTransformResult;
    }

    boolean isCancelled() {
        Future<?> future = this.future;
        return future != null && future.isCancelled();
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            updateThreadName(this.data);
            if (this.picasso.loggingEnabled) {
                Utils.log("Hunter", "executing", Utils.getLogIdsForHunter(this));
            }
            Bitmap bitmapHunt = hunt();
            this.result = bitmapHunt;
            if (bitmapHunt == null) {
                this.dispatcher.dispatchFailed(this);
            } else {
                this.dispatcher.dispatchComplete(this);
            }
        } catch (IOException e10) {
            this.exception = e10;
            this.dispatcher.dispatchRetry(this);
        } catch (NetworkRequestHandler.ResponseException e11) {
            if (!NetworkPolicy.isOfflineOnly(e11.networkPolicy) || e11.code != 504) {
                this.exception = e11;
            }
            this.dispatcher.dispatchFailed(this);
        } catch (Exception e12) {
            this.exception = e12;
            this.dispatcher.dispatchFailed(this);
        } catch (OutOfMemoryError e13) {
            StringWriter stringWriter = new StringWriter();
            this.stats.createSnapshot().dump(new PrintWriter(stringWriter));
            this.exception = new RuntimeException(stringWriter.toString(), e13);
            this.dispatcher.dispatchFailed(this);
        } finally {
            Thread.currentThread().setName("Picasso-Idle");
        }
    }

    boolean shouldRetry(boolean z10, NetworkInfo networkInfo) {
        int i10 = this.retryCount;
        if (i10 <= 0) {
            return false;
        }
        this.retryCount = i10 - 1;
        return this.requestHandler.shouldRetry(z10, networkInfo);
    }

    boolean supportsReplay() {
        return this.requestHandler.supportsReplay();
    }
}
