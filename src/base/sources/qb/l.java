package qb;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.WindowManager;
import com.google.android.exoplayer2.util.GlUtil;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class l extends GLSurfaceView {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f50581m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList f50582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SensorManager f50583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Sensor f50584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f50585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Handler f50586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final m f50587f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final i f50588g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private SurfaceTexture f50589h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Surface f50590i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f50591j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f50592k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f50593l;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    final class a implements GLSurfaceView.Renderer, m.a, d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final i f50594a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float[] f50597d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float[] f50598e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float[] f50599f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private float f50600g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f50601h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float[] f50595b = new float[16];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float[] f50596c = new float[16];

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final float[] f50602i = new float[16];

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final float[] f50603j = new float[16];

        public a(i iVar) {
            float[] fArr = new float[16];
            this.f50597d = fArr;
            float[] fArr2 = new float[16];
            this.f50598e = fArr2;
            float[] fArr3 = new float[16];
            this.f50599f = fArr3;
            this.f50594a = iVar;
            GlUtil.j(fArr);
            GlUtil.j(fArr2);
            GlUtil.j(fArr3);
            this.f50601h = 3.1415927f;
        }

        private float c(float f10) {
            if (f10 > 1.0f) {
                return (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f10))) * 2.0d);
            }
            return 90.0f;
        }

        private void d() {
            Matrix.setRotateM(this.f50598e, 0, -this.f50600g, (float) Math.cos(this.f50601h), (float) Math.sin(this.f50601h), 0.0f);
        }

        @Override // qb.d.a
        public synchronized void a(float[] fArr, float f10) {
            float[] fArr2 = this.f50597d;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            this.f50601h = -f10;
            d();
        }

        @Override // qb.m.a
        public synchronized void b(PointF pointF) {
            this.f50600g = pointF.y;
            d();
            Matrix.setRotateM(this.f50599f, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(this.f50603j, 0, this.f50597d, 0, this.f50599f, 0);
                Matrix.multiplyMM(this.f50602i, 0, this.f50598e, 0, this.f50603j, 0);
            }
            Matrix.multiplyMM(this.f50596c, 0, this.f50595b, 0, this.f50602i, 0);
            this.f50594a.e(this.f50596c, false);
        }

        @Override // qb.m.a
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return l.this.performClick();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
            GLES20.glViewport(0, 0, i10, i11);
            float f10 = i10 / i11;
            Matrix.perspectiveM(this.f50595b, 0, c(f10), f10, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            l.this.e(this.f50594a.f());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        void x(Surface surface);

        void y(Surface surface);
    }

    public l(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void a(l lVar) {
        Surface surface = lVar.f50590i;
        if (surface != null) {
            Iterator it = lVar.f50582a.iterator();
            while (it.hasNext()) {
                ((b) it.next()).x(surface);
            }
        }
        f(lVar.f50589h, surface);
        lVar.f50589h = null;
        lVar.f50590i = null;
    }

    public static /* synthetic */ void b(l lVar, SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = lVar.f50589h;
        Surface surface = lVar.f50590i;
        Surface surface2 = new Surface(surfaceTexture);
        lVar.f50589h = surfaceTexture;
        lVar.f50590i = surface2;
        Iterator it = lVar.f50582a.iterator();
        while (it.hasNext()) {
            ((b) it.next()).y(surface2);
        }
        f(surfaceTexture2, surface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final SurfaceTexture surfaceTexture) {
        this.f50586e.post(new Runnable() { // from class: qb.j
            @Override // java.lang.Runnable
            public final void run() {
                l.b(this.f50578a, surfaceTexture);
            }
        });
    }

    private static void f(SurfaceTexture surfaceTexture, Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    private void h() {
        boolean z10 = this.f50591j && this.f50592k;
        Sensor sensor = this.f50584c;
        if (sensor == null || z10 == this.f50593l) {
            return;
        }
        if (z10) {
            this.f50583b.registerListener(this.f50585d, sensor, 0);
        } else {
            this.f50583b.unregisterListener(this.f50585d);
        }
        this.f50593l = z10;
    }

    public void d(b bVar) {
        this.f50582a.add(bVar);
    }

    public void g(b bVar) {
        this.f50582a.remove(bVar);
    }

    public qb.a getCameraMotionListener() {
        return this.f50588g;
    }

    public pb.k getVideoFrameMetadataListener() {
        return this.f50588g;
    }

    public Surface getVideoSurface() {
        return this.f50590i;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f50586e.post(new Runnable() { // from class: qb.k
            @Override // java.lang.Runnable
            public final void run() {
                l.a(this.f50580a);
            }
        });
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        this.f50592k = false;
        h();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        this.f50592k = true;
        h();
    }

    public void setDefaultStereoMode(int i10) {
        this.f50588g.g(i10);
    }

    public void setUseSensorRotation(boolean z10) {
        this.f50591j = z10;
        h();
    }

    public l(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f50582a = new CopyOnWriteArrayList();
        this.f50586e = new Handler(Looper.getMainLooper());
        SensorManager sensorManager = (SensorManager) ob.a.e(context.getSystemService("sensor"));
        this.f50583b = sensorManager;
        Sensor defaultSensor = r0.f48425a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.f50584c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        i iVar = new i();
        this.f50588g = iVar;
        a aVar = new a(iVar);
        m mVar = new m(context, aVar, 25.0f);
        this.f50587f = mVar;
        this.f50585d = new d(((WindowManager) ob.a.e((WindowManager) context.getSystemService("window"))).getDefaultDisplay(), mVar, aVar);
        this.f50591j = true;
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(mVar);
    }
}
