package oi;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.util.Log;
import android.view.Surface;
import java.util.concurrent.atomic.AtomicBoolean;
import ti.b;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private EGLContext f48922a = EGL14.EGL_NO_CONTEXT;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private EGLSurface f48923b = EGL14.EGL_NO_SURFACE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private EGLDisplay f48924c = EGL14.EGL_NO_DISPLAY;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f48925d = new AtomicBoolean(false);

    public void a() {
        b(2, 2, null, null);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:24:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:27:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:28:0x010d  */
    public void b(int i10, int i11, Surface surface, EGLContext eGLContext) {
        int[] iArr;
        int[] iArr2;
        EGLConfig[] eGLConfigArr;
        EGLContext eGLContext2;
        if (e()) {
            Log.e("SurfaceManager", "already ready, ignored");
            return;
        }
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f48924c = eGLDisplayEglGetDisplay;
        if (eGLDisplayEglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            throw new RuntimeException("unable to get EGL14 display");
        }
        int[] iArr3 = new int[2];
        if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr3, 0, iArr3, 1)) {
            throw new RuntimeException("unable to initialize EGL14");
        }
        if (eGLContext == null && surface == null) {
            iArr = new int[]{12324, 8, 12323, 8, 12322, 8, 12339, 1, 12352, 4, 12344};
        } else {
            if (eGLContext != null) {
                if (surface == null) {
                    iArr2 = new int[]{12324, 8, 12323, 8, 12322, 8, 12339, 1, 12352, 4, 12610, 1, 12344};
                } else {
                    iArr = new int[]{12324, 8, 12323, 8, 12322, 8, 12352, 4, 12610, 1, 12344};
                }
                eGLConfigArr = new EGLConfig[1];
                EGL14.eglChooseConfig(this.f48924c, iArr2, 0, eGLConfigArr, 0, 1, new int[1], 0);
                b.a("eglCreateContext RGB888+recordable ES2");
                int[] iArr4 = {12440, 2, 12344};
                EGLDisplay eGLDisplay = this.f48924c;
                EGLConfig eGLConfig = eGLConfigArr[0];
                if (eGLContext == null) {
                    eGLContext2 = EGL14.EGL_NO_CONTEXT;
                } else {
                    eGLContext2 = eGLContext;
                }
                this.f48922a = EGL14.eglCreateContext(eGLDisplay, eGLConfig, eGLContext2, iArr4, 0);
                b.a("eglCreateContext");
                if (surface == null) {
                    this.f48923b = EGL14.eglCreatePbufferSurface(this.f48924c, eGLConfigArr[0], new int[]{12375, i10, 12374, i11, 12344}, 0);
                } else {
                    this.f48923b = EGL14.eglCreateWindowSurface(this.f48924c, eGLConfigArr[0], surface, new int[]{12344}, 0);
                }
                b.a("eglCreateWindowSurface");
                this.f48925d.set(true);
                Log.i("SurfaceManager", "GL initialized");
            }
            iArr = new int[]{12324, 8, 12323, 8, 12322, 8, 12352, 4, 12344};
        }
        iArr2 = iArr;
        eGLConfigArr = new EGLConfig[1];
        EGL14.eglChooseConfig(this.f48924c, iArr2, 0, eGLConfigArr, 0, 1, new int[1], 0);
        b.a("eglCreateContext RGB888+recordable ES2");
        int[] iArr5 = {12440, 2, 12344};
        EGLDisplay eGLDisplay2 = this.f48924c;
        EGLConfig eGLConfig2 = eGLConfigArr[0];
        if (eGLContext == null) {
            eGLContext2 = EGL14.EGL_NO_CONTEXT;
        } else {
            eGLContext2 = eGLContext;
        }
        this.f48922a = EGL14.eglCreateContext(eGLDisplay2, eGLConfig2, eGLContext2, iArr5, 0);
        b.a("eglCreateContext");
        if (surface == null) {
            this.f48923b = EGL14.eglCreatePbufferSurface(this.f48924c, eGLConfigArr[0], new int[]{12375, i10, 12374, i11, 12344}, 0);
        } else {
            this.f48923b = EGL14.eglCreateWindowSurface(this.f48924c, eGLConfigArr[0], surface, new int[]{12344}, 0);
        }
        b.a("eglCreateWindowSurface");
        this.f48925d.set(true);
        Log.i("SurfaceManager", "GL initialized");
    }

    public void c(int i10, int i11, a aVar) {
        b(i10, i11, null, aVar.f48922a);
    }

    public void d(Surface surface, a aVar) {
        b(2, 2, surface, aVar.f48922a);
    }

    public boolean e() {
        return this.f48925d.get();
    }

    public void f() {
        EGLDisplay eGLDisplay = this.f48924c;
        EGLSurface eGLSurface = this.f48923b;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f48922a)) {
            return;
        }
        Log.e("SurfaceManager", "eglMakeCurrent failed");
    }

    public void g() {
        EGLDisplay eGLDisplay = this.f48924c;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroySurface(this.f48924c, this.f48923b);
            EGL14.eglDestroyContext(this.f48924c, this.f48922a);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f48924c);
            Log.i("SurfaceManager", "GL released");
            this.f48924c = EGL14.EGL_NO_DISPLAY;
            this.f48922a = EGL14.EGL_NO_CONTEXT;
            this.f48923b = EGL14.EGL_NO_SURFACE;
        } else {
            Log.e("SurfaceManager", "GL already released");
        }
        this.f48925d.set(false);
    }

    public void h() {
        if (EGL14.eglSwapBuffers(this.f48924c, this.f48923b)) {
            return;
        }
        Log.e("SurfaceManager", "eglSwapBuffers failed");
    }
}
