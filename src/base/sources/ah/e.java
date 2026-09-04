package ah;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.widget.AutoFitTextureView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import zg.o;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class e extends o implements View.OnClickListener {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final SparseIntArray f307c0;
    private int A;
    private int B;
    private float C;
    private float D;
    private boolean E;
    private String F;
    private int G;
    private final float H;
    private float I;
    private float J;
    private boolean K;
    private float L;
    private float M;
    private float N;
    private float O;
    private float P;
    private float Q;
    private float R;
    private final lg.a S;
    private float T;
    private float U;
    private boolean V;
    private final CameraCaptureSession.CaptureCallback W;
    private int X;
    private final Runnable Y;
    private final TextureView.SurfaceTextureListener Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final CameraDevice.StateCallback f308a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private final View.OnTouchListener f309b0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private CameraCaptureSession f310g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private CameraDevice f311h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Size f312i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f313j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f314k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f315l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private HandlerThread f316m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Handler f317n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private CaptureRequest.Builder f318o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private CaptureRequest f319p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Semaphore f320q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private i f321r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final h f322s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final CardView f323t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final AutoFitTextureView f324u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final FrameLayout f325v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final FrameLayout f326w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final FrameLayout f327x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final FrameLayout f328y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Handler f329z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends CameraCaptureSession.CaptureCallback {
        a() {
        }

        public static /* synthetic */ void b(a aVar) {
            e.this.f323t.findViewById(R.id.texture_container_fl).setAlpha(1.0f);
            try {
                e.this.f310g.setRepeatingRequest(e.this.f319p, null, e.this.f317n);
            } catch (CameraAccessException e10) {
                e10.printStackTrace();
                com.google.firebase.crashlytics.a.b().d(e10);
            } catch (Exception e11) {
                wp.a.e(e11);
                com.google.firebase.crashlytics.a.b().d(e11);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j10, long j11) {
            super.onCaptureStarted(cameraCaptureSession, captureRequest, j10, j11);
            wp.a.a("onCaptureStarted", new Object[0]);
            e.this.f329z.post(new Runnable() { // from class: ah.c
                @Override // java.lang.Runnable
                public final void run() {
                    e.a.b(this.f305a);
                }
            });
            e.this.f329z.postDelayed(new Runnable() { // from class: ah.d
                @Override // java.lang.Runnable
                public final void run() {
                    e.this.f328y.setVisibility(4);
                }
            }, 500L);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c extends CameraDevice.StateCallback {
        c() {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            e.this.f320q.release();
            cameraDevice.close();
            e.this.f311h = null;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i10) {
            e.this.f320q.release();
            cameraDevice.close();
            e.this.f311h = null;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            e.this.f320q.release();
            e.this.f311h = cameraDevice;
            e.this.A0();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d extends CameraCaptureSession.StateCallback {
        d() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            Toast.makeText(e.this.f58881e, R.string.toast_cant_start_camera, 0).show();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            if (e.this.f311h == null) {
                return;
            }
            e.this.f310g = cameraCaptureSession;
            try {
                e eVar = e.this;
                eVar.f319p = eVar.f318o.build();
                e.this.f310g.capture(e.this.f319p, e.this.W, e.this.f317n);
                wp.a.a("CameraCaptureSession.StateCallback", new Object[0]);
            } catch (CameraAccessException e10) {
                e10.printStackTrace();
                com.google.firebase.crashlytics.a.b().d(e10);
            }
        }
    }

    /* JADX INFO: renamed from: ah.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0005e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ObjectAnimator f334a;

        C0005e(ObjectAnimator objectAnimator) {
            this.f334a = objectAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            e.this.B0();
            this.f334a.start();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class f implements View.OnTouchListener {
        f() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            e.this.f323t.requestDisallowInterceptTouchEvent(true);
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                e.this.I = x10;
                e.this.J = y10;
                e.this.K = false;
                e.this.f329z.removeCallbacks(e.this.Y);
            } else if (actionMasked == 1) {
                if (e.this.K) {
                    e.this.S.k(R.string.pref_cam_size, e.this.f58878b.width);
                }
                e.this.D0(false);
            } else if (actionMasked == 2 && (Math.abs(x10 - e.this.I) > e.this.H || Math.abs(y10 - e.this.J) > e.this.H)) {
                e.this.L = view.getX();
                e.this.M = view.getY();
                e eVar = e.this;
                eVar.N = (x10 + eVar.L) / (e.this.I + e.this.L);
                e eVar2 = e.this;
                eVar2.O = (y10 + eVar2.M) / (e.this.J + e.this.M);
                e eVar3 = e.this;
                eVar3.P = Math.max(eVar3.N, e.this.O);
                e eVar4 = e.this;
                eVar4.Q = eVar4.P * e.this.f323t.getWidth();
                e eVar5 = e.this;
                eVar5.R = eVar5.P * e.this.f323t.getHeight();
                e eVar6 = e.this;
                eVar6.K0(eVar6.Q, e.this.R);
                e.this.K = true;
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class g implements Comparator {
        g() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Size size, Size size2) {
            return Long.signum((((long) size.getWidth()) * ((long) size.getHeight())) - (((long) size2.getWidth()) * ((long) size2.getHeight())));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class h extends FrameLayout {
        public h(Context context) {
            super(context);
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            e.this.T = motionEvent.getRawX();
            e.this.U = motionEvent.getRawY();
            if (motionEvent.getAction() == 0) {
                e eVar = e.this;
                eVar.A = eVar.f58878b.x;
                e eVar2 = e.this;
                eVar2.B = eVar2.f58878b.y;
                e eVar3 = e.this;
                eVar3.C = eVar3.T;
                e eVar4 = e.this;
                eVar4.D = eVar4.U;
            }
            return super.dispatchTouchEvent(motionEvent);
        }

        @Override // android.view.View
        protected void onConfigurationChanged(Configuration configuration) {
            super.onConfigurationChanged(configuration);
            e eVar = e.this;
            eVar.z0(eVar.f324u.getWidth(), e.this.f324u.getHeight());
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if ((action == 1 || action == 2) && (Math.abs(e.this.T - e.this.C) > e.this.H || Math.abs(e.this.U - e.this.D) > e.this.H)) {
                return true;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 2) {
                float f10 = e.this.T - e.this.C;
                float f11 = e.this.U - e.this.D;
                if (Math.max(Math.abs(f10), Math.abs(f11)) > e.this.H) {
                    e eVar = e.this;
                    eVar.f58878b.x = eVar.A + ((int) f10);
                    e eVar2 = e.this;
                    eVar2.f58878b.y = eVar2.B + ((int) f11);
                    e.this.e();
                    e.this.E = true;
                }
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface i {
        void a();
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f307c0 = sparseIntArray;
        sparseIntArray.append(0, 90);
        sparseIntArray.append(1, 0);
        sparseIntArray.append(2, 270);
        sparseIntArray.append(3, 180);
    }

    public e(Context context) {
        super(context);
        this.f314k = 0;
        this.f315l = 2;
        this.f320q = new Semaphore(1);
        this.I = 0.0f;
        this.J = 0.0f;
        this.K = false;
        this.L = 0.0f;
        this.M = 0.0f;
        this.N = 0.0f;
        this.O = 0.0f;
        this.P = 0.0f;
        this.Q = 0.0f;
        this.R = 0.0f;
        this.V = false;
        this.W = new a();
        this.Y = new Runnable() { // from class: ah.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f303a.D0(false);
            }
        };
        this.Z = new b();
        this.f308a0 = new c();
        f fVar = new f();
        this.f309b0 = fVar;
        lg.a aVar = new lg.a(context);
        this.S = aVar;
        this.f329z = new Handler();
        int iD = aVar.d(R.string.pref_cam_size, context.getResources().getDimensionPixelSize(R.dimen.float_camera_window_size_default));
        this.f313j = iD;
        WindowManager.LayoutParams layoutParams = this.f58878b;
        layoutParams.width = iD;
        layoutParams.height = iD;
        layoutParams.x = context.getResources().getDimensionPixelSize(R.dimen.float_camera_window_margin);
        WindowManager.LayoutParams layoutParams2 = this.f58878b;
        layoutParams2.y = layoutParams2.x;
        h hVar = new h(context);
        this.f322s = hVar;
        d(hVar);
        CardView cardView = (CardView) LayoutInflater.from(context).inflate(R.layout.bubble_camera, (ViewGroup) null);
        this.f323t = cardView;
        hVar.addView(cardView);
        this.f324u = (AutoFitTextureView) cardView.findViewById(R.id.texture);
        this.f328y = (FrameLayout) cardView.findViewById(R.id.action_fl);
        FrameLayout frameLayout = (FrameLayout) cardView.findViewById(R.id.close_iv);
        this.f325v = frameLayout;
        FrameLayout frameLayout2 = (FrameLayout) cardView.findViewById(R.id.switch_camera_iv);
        this.f326w = frameLayout2;
        FrameLayout frameLayout3 = (FrameLayout) cardView.findViewById(R.id.expand_or_collapse_iv);
        this.f327x = frameLayout3;
        frameLayout.setOnClickListener(this);
        frameLayout2.setOnClickListener(this);
        cardView.setOnClickListener(new View.OnClickListener() { // from class: ah.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e eVar = this.f304a;
                eVar.D0(!eVar.V);
            }
        });
        frameLayout3.setOnTouchListener(fVar);
        this.H = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0() {
        try {
            SurfaceTexture surfaceTexture = this.f324u.getSurfaceTexture();
            surfaceTexture.setDefaultBufferSize(this.f312i.getWidth(), this.f312i.getHeight());
            Surface surface = new Surface(surfaceTexture);
            CaptureRequest.Builder builderCreateCaptureRequest = this.f311h.createCaptureRequest(1);
            this.f318o = builderCreateCaptureRequest;
            builderCreateCaptureRequest.addTarget(surface);
            this.f311h.createCaptureSession(Arrays.asList(surface), new d(), null);
        } catch (CameraAccessException e10) {
            e10.printStackTrace();
            com.google.firebase.crashlytics.a.b().d(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B0() {
        if (this.f324u.isAvailable()) {
            wp.a.a("open camera: Texture is available", new Object[0]);
            C0(this.f324u.getWidth(), this.f324u.getHeight());
        } else {
            wp.a.a("open camera: Texture is not available", new Object[0]);
            this.f324u.setSurfaceTextureListener(this.Z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C0(int i10, int i11) {
        F0(i10, i11);
        z0(i10, i11);
        CameraManager cameraManager = (CameraManager) this.f58881e.getSystemService("camera");
        try {
            if (!this.f320q.tryAcquire(2500L, TimeUnit.MILLISECONDS)) {
                throw new RuntimeException("Time out waiting to lock camera opening.");
            }
            cameraManager.openCamera(this.F, this.f308a0, this.f317n);
        } catch (InterruptedException e10) {
            throw new RuntimeException("Interrupted while trying to lock camera opening.", e10);
        } catch (Exception e11) {
            com.google.firebase.crashlytics.a.b().d(e11);
            wp.a.e(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D0(boolean z10) {
        if (z10) {
            this.f328y.setVisibility(0);
            this.f329z.postDelayed(this.Y, 5000L);
        } else {
            this.f328y.setVisibility(4);
            this.f329z.removeCallbacks(this.Y);
        }
        this.V = z10;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d1  */
    private void F0(int i10, int i11) {
        StreamConfigurationMap streamConfigurationMap;
        int i12;
        int i13;
        wp.a.a("setUpCameraOutputs", new Object[0]);
        CameraManager cameraManager = (CameraManager) this.f58881e.getSystemService("camera");
        try {
            int length = cameraManager.getCameraIdList().length;
            this.f315l = length;
            boolean z10 = true;
            if (length == 0) {
                Toast.makeText(this.f58881e, R.string.toast_cant_start_camera, 1).show();
                return;
            }
            if (length == 1) {
                this.f326w.setVisibility(8);
            }
            for (String str : cameraManager.getCameraIdList()) {
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                if ((num == null || num.intValue() == this.f314k || this.f315l <= 1) && (streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null) {
                    Size size = (Size) Collections.max(Arrays.asList(streamConfigurationMap.getOutputSizes(256)), new g());
                    this.X = this.f58877a.getDefaultDisplay().getRotation();
                    int iIntValue = ((Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
                    this.G = iIntValue;
                    int i14 = this.X;
                    if (i14 == 0) {
                        if (iIntValue != 90 && iIntValue != 270) {
                            z10 = false;
                        }
                    } else if (i14 != 1) {
                        if (i14 != 2) {
                            if (i14 != 3) {
                                wp.a.d("Display rotation is invalid: " + this.X, new Object[0]);
                            } else if (iIntValue != 0) {
                            }
                        } else if (iIntValue != 90) {
                        }
                        z10 = false;
                    } else if (iIntValue != 0 && iIntValue != 180) {
                        z10 = false;
                    }
                    Point point = new Point();
                    this.f58877a.getDefaultDisplay().getSize(point);
                    int i15 = point.x;
                    int i16 = point.y;
                    if (z10) {
                        i15 = i16;
                        i16 = i15;
                        i13 = i10;
                        i12 = i11;
                    } else {
                        i12 = i10;
                        i13 = i11;
                    }
                    this.f312i = x0(streamConfigurationMap.getOutputSizes(SurfaceTexture.class), i12, i13, i15 > 1920 ? 1920 : i15, i16 > 1080 ? 1080 : i16, size);
                    wp.a.a("Preview size: width - " + this.f312i.getWidth() + ", height - " + this.f312i.getHeight(), new Object[0]);
                    if (this.f58881e.getResources().getConfiguration().orientation == 2) {
                        this.f324u.b(this.f312i.getWidth(), this.f312i.getHeight());
                    } else {
                        this.f324u.b(this.f312i.getHeight(), this.f312i.getWidth());
                    }
                    J0();
                    this.F = str;
                    return;
                }
            }
        } catch (CameraAccessException e10) {
            e10.printStackTrace();
            com.google.firebase.crashlytics.a.b().d(e10);
        } catch (NullPointerException e11) {
            wp.a.e(e11);
            com.google.firebase.crashlytics.a.b().d(e11);
            Toast.makeText(this.f58881e, R.string.toast_try_again, 0).show();
        }
    }

    private void H0() {
        HandlerThread handlerThread = new HandlerThread("CameraBackground");
        this.f316m = handlerThread;
        handlerThread.start();
        this.f317n = new Handler(this.f316m.getLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I0() {
        if (this.f317n != null) {
            this.f316m.quitSafely();
            try {
                this.f316m.join();
                this.f316m = null;
                this.f317n = null;
            } catch (InterruptedException e10) {
                e10.printStackTrace();
                com.google.firebase.crashlytics.a.b().d(e10);
            }
        }
    }

    private void J0() {
        int i10 = this.f58881e.getResources().getConfiguration().orientation;
        ViewGroup.LayoutParams layoutParams = this.f324u.getLayoutParams();
        if (i10 == 2) {
            layoutParams.width = (this.f313j * this.f312i.getWidth()) / this.f312i.getHeight();
            layoutParams.height = this.f313j;
        } else {
            int i11 = this.f313j;
            layoutParams.width = i11;
            layoutParams.height = (i11 * this.f312i.getWidth()) / this.f312i.getHeight();
        }
        this.f324u.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K0(float f10, float f11) {
        float dimensionPixelSize = this.f58881e.getResources().getDimensionPixelSize(R.dimen.float_camera_window_size_max);
        float dimensionPixelSize2 = this.f58881e.getResources().getDimensionPixelSize(R.dimen.float_camera_window_size_min);
        this.f58878b.width = (int) Math.max(Math.min(f10, dimensionPixelSize), dimensionPixelSize2);
        this.f58878b.height = (int) Math.max(Math.min(f11, dimensionPixelSize), dimensionPixelSize2);
        e();
        this.f313j = this.f58878b.width;
        this.f324u.a();
        J0();
    }

    private static Size x0(Size[] sizeArr, int i10, int i11, int i12, int i13, Size size) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int width = size.getWidth();
        int height = size.getHeight();
        for (Size size2 : sizeArr) {
            if (size2.getWidth() <= i12 && size2.getHeight() <= i13 && size2.getHeight() == (size2.getWidth() * height) / width) {
                if (size2.getWidth() < i10 || size2.getHeight() < i11) {
                    arrayList2.add(size2);
                } else {
                    arrayList.add(size2);
                }
            }
        }
        if (arrayList.size() > 0) {
            return (Size) Collections.min(arrayList, new g());
        }
        if (arrayList2.size() > 0) {
            return (Size) Collections.max(arrayList2, new g());
        }
        wp.a.d("Couldn't find any suitable preview size", new Object[0]);
        return sizeArr[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y0() {
        try {
            try {
                this.f320q.acquire();
                CameraCaptureSession cameraCaptureSession = this.f310g;
                if (cameraCaptureSession != null) {
                    cameraCaptureSession.close();
                    this.f310g = null;
                }
                CameraDevice cameraDevice = this.f311h;
                if (cameraDevice != null) {
                    cameraDevice.close();
                    this.f311h = null;
                }
                this.f320q.release();
            } catch (InterruptedException e10) {
                throw new RuntimeException("Interrupted while trying to lock camera closing.", e10);
            }
        } catch (Throwable th2) {
            this.f320q.release();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z0(int i10, int i11) {
        if (this.f324u == null || this.f312i == null) {
            return;
        }
        int rotation = this.f58877a.getDefaultDisplay().getRotation();
        Matrix matrix = new Matrix();
        float f10 = i10;
        float f11 = i11;
        RectF rectF = new RectF(0.0f, 0.0f, f10, f11);
        float fCenterX = rectF.centerX();
        float fCenterY = rectF.centerY();
        wp.a.a("rotation: %d, preview height: %d, width: %d, Texture height: %d - width: %d", Integer.valueOf(rotation), Integer.valueOf(this.f312i.getHeight()), Integer.valueOf(this.f312i.getWidth()), Integer.valueOf(i11), Integer.valueOf(i10));
        int i12 = this.X;
        if (i12 == 1 || i12 == 3) {
            RectF rectF2 = new RectF(0.0f, 0.0f, this.f312i.getHeight(), this.f312i.getWidth());
            rectF2.offset(fCenterX - rectF2.centerX(), fCenterY - rectF2.centerY());
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            float fMax = Math.max(f11 / this.f312i.getHeight(), f10 / this.f312i.getWidth());
            wp.a.a("scale: %f, scale1: %f, scale2: %f", Float.valueOf(fMax), Float.valueOf(f11 / this.f312i.getHeight()), Float.valueOf(f10 / this.f312i.getWidth()));
            matrix.postScale(fMax, fMax, fCenterX, fCenterY);
        }
        if (1 == rotation || 3 == rotation) {
            matrix.postRotate((rotation - 2) * 90, fCenterX, fCenterY);
        } else if (2 == rotation) {
            matrix.postRotate(180.0f, fCenterX, fCenterY);
        }
        this.f324u.setTransform(matrix);
    }

    public void E0(i iVar) {
        this.f321r = iVar;
    }

    public void G0() {
        e();
        H0();
        B0();
        this.S.j(R.string.pref_show_camera, true);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R.id.close_iv) {
            this.f329z.removeCallbacks(this.Y);
            if (this.f321r != null) {
                this.S.j(R.string.pref_show_camera, false);
                this.f321r.a();
                return;
            }
            return;
        }
        if (id2 != R.id.switch_camera_iv) {
            return;
        }
        this.f314k = this.f314k == 0 ? 1 : 0;
        y0();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f323t, "scaleX", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f323t, "scaleX", 0.0f, 1.0f);
        objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        objectAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfFloat.addListener(new C0005e(objectAnimatorOfFloat2));
        objectAnimatorOfFloat.start();
        D0(false);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements TextureView.SurfaceTextureListener {
        b() {
        }

        public static /* synthetic */ void a(b bVar) {
            e.this.y0();
            e.this.I0();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            wp.a.a("width: " + e.this.f324u.getWidth() + ", height: " + e.this.f324u.getHeight(), new Object[0]);
            e.this.C0(i10, i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            e.this.f317n.post(new Runnable() { // from class: ah.f
                @Override // java.lang.Runnable
                public final void run() {
                    e.b.a(this.f338a);
                }
            });
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            wp.a.a("Changed - width: " + e.this.f324u.getWidth() + ", height: " + e.this.f324u.getHeight(), new Object[0]);
            e.this.z0(i10, i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }
}
