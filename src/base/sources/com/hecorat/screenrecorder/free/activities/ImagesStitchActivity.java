package com.hecorat.screenrecorder.free.activities;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.activity.d0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.activities.ImagesStitchActivity;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import nh.f0;
import nh.j0;
import tf.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class ImagesStitchActivity extends androidx.appcompat.app.d implements com.hecorat.screenrecorder.free.widget.d.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s f22616c;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f22622i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f22623j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f22617d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f22618e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f22619f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f22620g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f22621h = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f22624k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f22625l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f22626m = 0;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f22627a;

        public a(View view) {
            this.f22627a = view;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f22627a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            try {
                ImagesStitchActivity.this.W0();
            } catch (IOException e10) {
                j0.b(ImagesStitchActivity.this, R.string.toast_can_not_open_file);
                wp.a.e(e10);
                com.google.firebase.crashlytics.a.b().d(e10);
                ImagesStitchActivity.this.finish();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class b extends d0 {
        public b(boolean z10) {
            super(z10);
        }

        @Override // androidx.activity.d0
        public void d() {
            if (ImagesStitchActivity.this.f22624k) {
                ImagesStitchActivity.this.V0();
            } else {
                ImagesStitchActivity.this.finish();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class c extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f22630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f22631b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f22632c;

        public c(int i10) {
            this.f22630a = i10;
        }

        private float[][] a(Bitmap bitmap) {
            int height = bitmap.getHeight();
            int width = bitmap.getWidth();
            this.f22631b = h(height);
            int iH = h(width);
            this.f22632c = iH;
            float[][] fArr = (float[][]) Array.newInstance((Class<?>) Float.TYPE, this.f22631b, iH * 2);
            for (int i10 = 0; i10 < height; i10++) {
                for (int i11 = 0; i11 < width; i11++) {
                    try {
                        fArr[i10][i11] = bitmap.getPixel(i11, i10);
                    } catch (IllegalArgumentException unused) {
                    }
                }
            }
            return fArr;
        }

        private HashMap c(float[][] fArr, int i10) {
            HashMap map = new HashMap();
            ImagesStitchActivity.this.R0("peak at maxRow = " + i10);
            for (int i11 = 0; i11 < i10; i11++) {
                if (map.size() < 1) {
                    map.put(Integer.valueOf(i11), Float.valueOf(fArr[i11][0]));
                } else {
                    int iE = e(map);
                    if (fArr[i11][0] > ((Float) map.get(Integer.valueOf(iE))).floatValue()) {
                        map.remove(Integer.valueOf(iE));
                        map.put(Integer.valueOf(i11), Float.valueOf(fArr[i11][0]));
                    }
                }
            }
            return map;
        }

        private int d(HashMap map) {
            Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
            int iIntValue = ((Integer) entry.getKey()).intValue();
            float fFloatValue = ((Float) entry.getValue()).floatValue();
            for (Map.Entry entry2 : map.entrySet()) {
                if (((Float) entry2.getValue()).floatValue() > fFloatValue) {
                    fFloatValue = ((Float) entry2.getValue()).floatValue();
                    iIntValue = ((Integer) entry2.getKey()).intValue();
                }
            }
            return iIntValue;
        }

        private int e(HashMap map) {
            Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
            int iIntValue = ((Integer) entry.getKey()).intValue();
            float fFloatValue = ((Float) entry.getValue()).floatValue();
            for (Map.Entry entry2 : map.entrySet()) {
                if (((Float) entry2.getValue()).floatValue() < fFloatValue) {
                    fFloatValue = ((Float) entry2.getValue()).floatValue();
                    iIntValue = ((Integer) entry2.getKey()).intValue();
                }
            }
            return iIntValue;
        }

        private int f() {
            if (!j()) {
                return 0;
            }
            int identifier = ImagesStitchActivity.this.getResources().getIdentifier("navigation_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? ImagesStitchActivity.this.getResources().getDimensionPixelSize(identifier) : 0;
            ImagesStitchActivity.this.R0("navigation bar height at " + dimensionPixelSize);
            return dimensionPixelSize;
        }

        private void g(float[][] fArr, float[][] fArr2, float[][] fArr3) {
            for (int i10 = 0; i10 < fArr.length; i10++) {
                for (int i11 = 0; i11 < fArr[0].length - 1; i11 += 2) {
                    float[] fArr4 = fArr[i10];
                    float f10 = fArr4[i11];
                    float[] fArr5 = fArr2[i10];
                    float f11 = fArr5[i11];
                    int i12 = i11 + 1;
                    float f12 = fArr4[i12];
                    float f13 = fArr5[i12];
                    float f14 = (f10 * f11) + (f12 * f13);
                    float f15 = (f11 * f12) - (f10 * f13);
                    double d10 = (f14 * f14) + (f15 * f15);
                    fArr3[i10][i11] = f14 / ((float) Math.sqrt(d10));
                    fArr3[i10][i12] = f15 / ((float) Math.sqrt(d10));
                }
            }
        }

        private int h(int i10) {
            int i11 = 2;
            while (i11 < i10) {
                i11 *= 2;
            }
            return i11;
        }

        private int i(Bitmap bitmap, Bitmap bitmap2) {
            int iMin = Math.min(bitmap.getWidth(), bitmap2.getWidth());
            int iMin2 = Math.min(bitmap.getHeight(), bitmap2.getHeight());
            int i10 = 0;
            int i11 = 0;
            while (i10 < iMin2) {
                long jRed = 0;
                long jRed2 = 0;
                long jGreen = 0;
                long jBlue = 0;
                long jGreen2 = 0;
                long jBlue2 = 0;
                int i12 = 0;
                while (i12 < iMin) {
                    int pixel = bitmap.getPixel(i12, i10);
                    int i13 = iMin2;
                    jRed += (long) Color.red(pixel);
                    jGreen += (long) Color.green(pixel);
                    jBlue += (long) Color.blue(pixel);
                    int pixel2 = bitmap2.getPixel(i12, i10);
                    jRed2 += (long) Color.red(pixel2);
                    jGreen2 += (long) Color.green(pixel2);
                    jBlue2 += (long) Color.blue(pixel2);
                    i12++;
                    iMin = iMin;
                    iMin2 = i13;
                }
                int i14 = iMin;
                int i15 = iMin2;
                if (jRed != jRed2 || jGreen != jGreen2 || jBlue != jBlue2) {
                    break;
                }
                i11++;
                i10++;
                iMin = i14;
                iMin2 = i15;
            }
            return i11;
        }

        private boolean j() {
            int identifier = ImagesStitchActivity.this.getResources().getIdentifier("config_showNavigationBar", "bool", "android");
            return identifier > 0 && ImagesStitchActivity.this.getResources().getBoolean(identifier);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = ImagesStitchActivity.this.f22622i;
            options.inJustDecodeBounds = false;
            Bitmap bitmap = (Bitmap) ImagesStitchActivity.this.f22618e.get(this.f22630a - 1);
            Bitmap bitmap2 = (Bitmap) ImagesStitchActivity.this.f22618e.get(this.f22630a);
            int iM = nh.b.m(ImagesStitchActivity.this) / ImagesStitchActivity.this.f22622i;
            int iF = f() / ImagesStitchActivity.this.f22622i;
            int i10 = iM + iF;
            if (i10 >= bitmap.getHeight() || i10 >= bitmap2.getHeight()) {
                wp.a.i("Image %d too small for cropping, using default 0", Integer.valueOf(this.f22630a));
                ImagesStitchActivity.this.f22620g.put(Integer.valueOf(this.f22630a), 0);
                return null;
            }
            try {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, iM, bitmap.getWidth(), (bitmap.getHeight() - iM) - iF);
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmap2, 0, iM, bitmap2.getWidth(), (bitmap2.getHeight() - iM) - iF);
                int i11 = i(bitmapCreateBitmap, bitmapCreateBitmap2);
                ImagesStitchActivity.this.R0("top bar height: " + i11);
                int height = bitmapCreateBitmap.getHeight();
                float[][] fArrA = a(bitmapCreateBitmap);
                lp.b bVar = new lp.b((long) this.f22631b, (long) this.f22632c);
                bVar.h(fArrA);
                float[][] fArrA2 = a(bitmapCreateBitmap2);
                bVar.h(fArrA2);
                float[][] fArr = (float[][]) Array.newInstance((Class<?>) Float.TYPE, this.f22631b, this.f22632c * 2);
                g(fArrA, fArrA2, fArr);
                bVar.i(fArr, false);
                HashMap mapC = c(fArr, height);
                HashMap map = new HashMap();
                for (Map.Entry entry : mapC.entrySet()) {
                    float fO0 = ImagesStitchActivity.this.O0(new Point(0, ((Integer) entry.getKey()).intValue()), bitmapCreateBitmap, bitmapCreateBitmap2);
                    map.put((Integer) entry.getKey(), Float.valueOf(fO0));
                    ImagesStitchActivity.this.R0("correlation = " + fO0 + " at " + entry.getKey());
                }
                int iD = d(map) * ImagesStitchActivity.this.f22622i;
                ImagesStitchActivity.this.f22620g.put(Integer.valueOf(this.f22630a), Integer.valueOf(d(map) * ImagesStitchActivity.this.f22622i));
                ImagesStitchActivity.this.R0("index of translation: " + this.f22630a + " " + iD);
            } catch (Exception unused) {
                ImagesStitchActivity.this.f22620g.put(Integer.valueOf(this.f22630a), 0);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r10) {
            ImagesStitchActivity.L0(ImagesStitchActivity.this);
            if (ImagesStitchActivity.this.f22626m == ImagesStitchActivity.this.f22625l && !isCancelled()) {
                ImagesStitchActivity.this.Q0();
            }
            super.onPostExecute(r10);
        }
    }

    public static /* synthetic */ int L0(ImagesStitchActivity imagesStitchActivity) {
        int i10 = imagesStitchActivity.f22626m;
        imagesStitchActivity.f22626m = i10 + 1;
        return i10;
    }

    private void N0() {
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        final ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setProgressStyle(0);
        progressDialog.setTitle(getString(R.string.stitch_images));
        progressDialog.setMessage(getString(R.string.please_wait));
        progressDialog.show();
        for (int i10 = 0; i10 < this.f22617d.size(); i10++) {
            com.hecorat.screenrecorder.free.widget.d dVar = (com.hecorat.screenrecorder.free.widget.d) this.f22617d.get(i10);
            int topValue = dVar.getTopValue();
            int bottomValue = dVar.getBottomValue();
            arrayList.add(Integer.valueOf(topValue));
            arrayList2.add(Integer.valueOf(bottomValue));
        }
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        final Handler handler = new Handler(Looper.getMainLooper());
        executorServiceNewSingleThreadExecutor.execute(new Runnable() { // from class: ff.y
            @Override // java.lang.Runnable
            public final void run() {
                ImagesStitchActivity.x0(this.f38585a, arrayList, arrayList2, handler, progressDialog);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float O0(Point point, Bitmap bitmap, Bitmap bitmap2) {
        int i10;
        int i11;
        int i12;
        Bitmap bitmap3 = bitmap;
        Bitmap bitmap4 = bitmap2;
        int width = bitmap3.getWidth();
        int height = bitmap3.getHeight();
        int width2 = bitmap4.getWidth();
        int height2 = bitmap4.getHeight();
        int i13 = point.x;
        int i14 = point.y;
        int iMax = i13 >= 0 ? Math.max(width, width2 + i13) : Math.max(width - i13, width2);
        int iMax2 = i14 >= 0 ? Math.max(height, height2 + i14) : Math.max(height - i14, height2);
        int i15 = 0;
        int iMax3 = Math.max(0, -i13);
        int iMax4 = Math.max(0, -i14);
        int iMax5 = Math.max(0, i13);
        int iMax6 = Math.max(0, i14);
        int i16 = 0;
        double pixel = 0.0d;
        double pixel2 = 0.0d;
        while (i16 < iMax2) {
            int i17 = 0;
            while (i17 < iMax) {
                if (i17 < iMax3 || i17 < iMax5 || i17 >= iMax3 + width || i17 >= iMax5 + width2 || i16 < iMax4 || i16 < iMax6 || i16 >= iMax4 + height || i16 >= iMax6 + height2) {
                    i15 = i15;
                } else {
                    pixel += (double) bitmap3.getPixel(i17 - iMax3, i16 - iMax4);
                    pixel2 += (double) bitmap4.getPixel(i17 - iMax5, i16 - iMax6);
                    i15++;
                }
                i17++;
                i16 = i16;
            }
            i16++;
        }
        double d10 = i15;
        double dMin = ((double) (Math.min(width, width2) * Math.min(height, height2))) * 0.01d;
        float f10 = 0.0f;
        if (d10 <= dMin) {
            return 0.0f;
        }
        double d11 = pixel / d10;
        double d12 = pixel2 / d10;
        double dPow = 0.0d;
        double dPow2 = 0.0d;
        double d13 = 0.0d;
        int i18 = 0;
        int i19 = 0;
        while (i18 < iMax2) {
            float f11 = f10;
            int i20 = 0;
            while (i20 < iMax) {
                if (i20 < iMax3 || i20 < iMax5) {
                    i10 = iMax6;
                    i11 = i18;
                    i12 = width2;
                } else {
                    i12 = width2;
                    if (i20 >= iMax3 + width || i20 >= iMax5 + i12 || i18 < iMax4 || i18 < iMax6 || i18 >= iMax4 + height || i18 >= iMax6 + height2) {
                        i10 = iMax6;
                        i11 = i18;
                    } else {
                        i10 = iMax6;
                        float pixel3 = bitmap3.getPixel(i20 - iMax3, i18 - iMax4);
                        float pixel4 = bitmap4.getPixel(i20 - iMax5, i18 - i10);
                        i19++;
                        double d14 = ((double) pixel3) - d11;
                        double d15 = ((double) pixel4) - d12;
                        d13 += d14 * d15;
                        i11 = i18;
                        dPow += Math.pow(d14, 2.0d);
                        dPow2 += Math.pow(d15, 2.0d);
                    }
                }
                i20++;
                bitmap3 = bitmap;
                bitmap4 = bitmap2;
                width2 = i12;
                iMax6 = i10;
                i18 = i11;
            }
            i18++;
            bitmap3 = bitmap;
            bitmap4 = bitmap2;
            f10 = f11;
        }
        float f12 = f10;
        double d16 = i19;
        double d17 = dPow2 / d16;
        double d18 = d13 / d16;
        double dSqrt = Math.sqrt(dPow / d16);
        double dSqrt2 = Math.sqrt(d17);
        return (dSqrt == 0.0d || dSqrt2 == 0.0d) ? f12 : (float) (d18 / (dSqrt * dSqrt2));
    }

    private int P0() {
        WindowManager windowManager = (WindowManager) getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q0() {
        for (int i10 = 0; i10 < this.f22623j; i10++) {
            RelativeLayout relativeLayout = new RelativeLayout(this);
            relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
            this.f22616c.C.addView(relativeLayout);
            Bitmap bitmap = (Bitmap) this.f22619f.get(i10);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int iP0 = (int) (P0() * 0.8f);
            float f10 = height;
            int i11 = (int) (((iP0 * 1.0f) * f10) / width);
            float f11 = (f10 * 1.0f) / i11;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iP0, i11);
            layoutParams.addRule(14, -1);
            try {
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, iP0, i11, true);
                ImageView imageView = new ImageView(this);
                imageView.setLayoutParams(layoutParams);
                imageView.setImageBitmap(bitmapCreateScaledBitmap);
                relativeLayout.addView(imageView);
                Integer num = (Integer) this.f22620g.get(Integer.valueOf(i10));
                if (num == null) {
                    return;
                }
                int iIntValue = num.intValue() > 0 ? (int) ((height - num.intValue()) / f11) : nh.b.m(this);
                if (iIntValue < 0) {
                    iIntValue = 0;
                }
                if (iIntValue >= i11) {
                    iIntValue = i11 - 1;
                }
                com.hecorat.screenrecorder.free.widget.d dVar = new com.hecorat.screenrecorder.free.widget.d(this, iP0, i11, iIntValue, f11);
                dVar.setLayoutParams(new RelativeLayout.LayoutParams(-1, i11));
                dVar.setScrollParentStateChange(this);
                relativeLayout.addView(dVar);
                this.f22617d.add(dVar);
            } catch (OutOfMemoryError e10) {
                wp.a.f(e10, "Failed to scale bitmap for image %d", Integer.valueOf(i10));
                com.google.firebase.crashlytics.a.b().d(e10);
                j0.b(this, R.string.error);
                finish();
                return;
            }
        }
        this.f22616c.F.setVisibility(4);
        this.f22616c.A.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R0(String str) {
    }

    private Bitmap S0(Bitmap bitmap, int i10) {
        if (i10 <= 0) {
            return bitmap;
        }
        return Bitmap.createScaledBitmap(bitmap, i10, (int) (((i10 * 1.0f) * bitmap.getHeight()) / bitmap.getWidth()), true);
    }

    private void T0() {
        u0(this.f22616c.E);
        androidx.appcompat.app.a aVarL0 = l0();
        if (aVarL0 == null) {
            return;
        }
        aVarL0.t(true);
        aVarL0.A(true);
    }

    private void U0() {
        int i10 = 1;
        for (int iE = nh.b.e(this); iE > 512; iE /= 2) {
            i10 *= 2;
        }
        this.f22622i = (int) (i10 * 1.5f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V0() {
        try {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle(getString(R.string.confirm_exit));
            builder.setMessage(getString(R.string.dialog_confirm_exit_stitch_images_msg));
            builder.setIcon(R.drawable.ic_info_gray_24dp);
            builder.setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null);
            builder.setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() { // from class: ff.b0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    this.f38505a.finish();
                }
            });
            AlertDialog alertDialogCreate = builder.create();
            alertDialogCreate.setCanceledOnTouchOutside(false);
            alertDialogCreate.show();
        } catch (OutOfMemoryError e10) {
            wp.a.e(e10);
            com.google.firebase.crashlytics.a.b().d(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W0() throws IOException {
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("images_for_stitch");
        if (parcelableArrayListExtra == null || parcelableArrayListExtra.isEmpty()) {
            j0.b(this, R.string.toast_no_screenshot_was_selected);
            finish();
            return;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = this.f22622i;
        options.inJustDecodeBounds = false;
        this.f22623j = parcelableArrayListExtra.size();
        ArrayList arrayList = new ArrayList();
        int size = parcelableArrayListExtra.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = parcelableArrayListExtra.get(i11);
            i11++;
            Uri uri = (Uri) obj;
            InputStream inputStreamOpenInputStream = getContentResolver().openInputStream(uri);
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream);
                if (bitmapDecodeStream == null) {
                    wp.a.i("Failed to decode bitmap from URI: %s", uri);
                    if (inputStreamOpenInputStream != null) {
                        inputStreamOpenInputStream.close();
                    }
                } else {
                    int width = bitmapDecodeStream.getWidth();
                    if (i10 < width) {
                        i10 = width;
                    }
                    arrayList.add(bitmapDecodeStream);
                    if (inputStreamOpenInputStream != null) {
                        inputStreamOpenInputStream.close();
                    }
                }
            } catch (Throwable th2) {
                if (inputStreamOpenInputStream != null) {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList.get(i12);
            i12++;
            Bitmap bitmapS0 = (Bitmap) obj2;
            if (bitmapS0.getWidth() < i10) {
                bitmapS0 = S0(bitmapS0, i10);
            }
            this.f22619f.add(bitmapS0);
        }
        int size3 = parcelableArrayListExtra.size();
        int i13 = 0;
        while (i13 < size3) {
            Object obj3 = parcelableArrayListExtra.get(i13);
            i13++;
            Uri uri2 = (Uri) obj3;
            InputStream inputStreamOpenInputStream2 = getContentResolver().openInputStream(uri2);
            try {
                Bitmap bitmapDecodeStream2 = BitmapFactory.decodeStream(inputStreamOpenInputStream2, null, options);
                if (bitmapDecodeStream2 == null) {
                    wp.a.i("Failed to decode scaled bitmap from URI: %s", uri2);
                    if (inputStreamOpenInputStream2 != null) {
                        inputStreamOpenInputStream2.close();
                    }
                } else {
                    this.f22618e.add(bitmapDecodeStream2);
                    if (inputStreamOpenInputStream2 != null) {
                        inputStreamOpenInputStream2.close();
                    }
                }
            } catch (Throwable th4) {
                if (inputStreamOpenInputStream2 != null) {
                    try {
                        inputStreamOpenInputStream2.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                }
                throw th4;
            }
        }
        this.f22620g.put(0, 0);
        for (int i14 = 1; i14 < this.f22623j; i14++) {
            if (((Bitmap) this.f22618e.get(i14 - 1)).getWidth() != ((Bitmap) this.f22618e.get(i14)).getWidth()) {
                this.f22620g.put(Integer.valueOf(i14), 0);
            } else {
                this.f22621h.add(new c(i14));
            }
        }
        int size4 = this.f22621h.size();
        this.f22625l = size4;
        if (size4 == 0) {
            Q0();
            return;
        }
        ArrayList arrayList2 = this.f22621h;
        int size5 = arrayList2.size();
        int i15 = 0;
        while (i15 < size5) {
            Object obj4 = arrayList2.get(i15);
            i15++;
            ((c) obj4).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public static /* synthetic */ void x0(final ImagesStitchActivity imagesStitchActivity, ArrayList arrayList, ArrayList arrayList2, final Handler handler, final ProgressDialog progressDialog) {
        imagesStitchActivity.getClass();
        try {
            ArrayList arrayList3 = new ArrayList();
            int i10 = 0;
            for (int i11 = 0; i11 < imagesStitchActivity.f22623j; i11++) {
                Bitmap bitmap = (Bitmap) imagesStitchActivity.f22619f.get(i11);
                arrayList3.add(Bitmap.createBitmap(bitmap, 0, ((Integer) arrayList.get(i11)).intValue(), bitmap.getWidth(), ((Integer) arrayList2.get(i11)).intValue() - ((Integer) arrayList.get(i11)).intValue()));
            }
            int size = arrayList3.size();
            int height = 0;
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList3.get(i12);
                i12++;
                height += ((Bitmap) obj).getHeight();
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((Bitmap) arrayList3.get(0)).getWidth(), height, Bitmap.Config.RGB_565);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            int size2 = arrayList3.size();
            float height2 = 0.0f;
            while (i10 < size2) {
                Object obj2 = arrayList3.get(i10);
                i10++;
                Bitmap bitmap2 = (Bitmap) obj2;
                canvas.drawBitmap(bitmap2, 0.0f, height2, (Paint) null);
                height2 += bitmap2.getHeight();
            }
            f0.H(imagesStitchActivity, bitmapCreateBitmap, true, new f0.e() { // from class: ff.z
                @Override // nh.f0.e
                public final void a(Uri uri) {
                    ImagesStitchActivity.z0(this.f38593a, handler, progressDialog, uri);
                }
            });
        } catch (Exception e10) {
            wp.a.e(e10);
            com.google.firebase.crashlytics.a.b().d(e10);
        }
    }

    public static /* synthetic */ void y0(ImagesStitchActivity imagesStitchActivity, ProgressDialog progressDialog, Uri uri) {
        imagesStitchActivity.getClass();
        progressDialog.dismiss();
        f0.B(imagesStitchActivity, uri, "image/*");
        imagesStitchActivity.finish();
    }

    public static /* synthetic */ void z0(final ImagesStitchActivity imagesStitchActivity, Handler handler, final ProgressDialog progressDialog, final Uri uri) {
        imagesStitchActivity.getClass();
        handler.post(new Runnable() { // from class: ff.a0
            @Override // java.lang.Runnable
            public final void run() {
                ImagesStitchActivity.y0(this.f38499a, progressDialog, uri);
            }
        });
    }

    @Override // com.hecorat.screenrecorder.free.widget.d.b
    public void g(boolean z10) {
        this.f22616c.D.setScroll(!z10);
        if (this.f22624k || !z10) {
            return;
        }
        this.f22624k = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.s, androidx.activity.p, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f22616c = (s) androidx.databinding.g.j(this, R.layout.activity_image_stitch);
        T0();
        U0();
        View decorView = getWindow().getDecorView();
        decorView.getViewTreeObserver().addOnGlobalLayoutListener(new a(decorView));
        lf.i.g(lf.l.m(lf.l.a.SHARE), lf.c.n(lf.c.a.SHARE));
        getOnBackPressedDispatcher().g(this, new b(true));
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.stitch_images, menu);
        return super.onCreateOptionsMenu(menu);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.d, androidx.fragment.app.s, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.f22621h;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            AsyncTask asyncTask = (AsyncTask) obj;
            if (asyncTask != null && !asyncTask.isCancelled()) {
                asyncTask.cancel(true);
            }
        }
        this.f22621h.clear();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.action_save) {
            N0();
            Bundle bundle = new Bundle();
            bundle.putString("edit_action", "stitch");
            FirebaseAnalytics.getInstance(this).a("edit_photo", bundle);
        } else if (itemId == 16908332) {
            getOnBackPressedDispatcher().l();
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
