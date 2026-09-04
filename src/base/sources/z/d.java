package z;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class d extends v.j {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a extends d {
        a() {
        }

        @Override // z.d
        public void h(View view, float f10) {
            view.setAlpha(a(f10));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class b extends d {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        String f58202f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        SparseArray f58203g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        float[] f58204h;

        public b(String str, SparseArray sparseArray) {
            this.f58202f = str.split(",")[1];
            this.f58203g = sparseArray;
        }

        @Override // v.j
        public void c(int i10, float f10) {
            throw new RuntimeException("call of custom attribute setPoint");
        }

        @Override // v.j
        public void e(int i10) {
            int size = this.f58203g.size();
            int iH = ((androidx.constraintlayout.widget.a) this.f58203g.valueAt(0)).h();
            double[] dArr = new double[size];
            this.f58204h = new float[iH];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, iH);
            for (int i11 = 0; i11 < size; i11++) {
                int iKeyAt = this.f58203g.keyAt(i11);
                androidx.constraintlayout.widget.a aVar = (androidx.constraintlayout.widget.a) this.f58203g.valueAt(i11);
                dArr[i11] = ((double) iKeyAt) * 0.01d;
                aVar.f(this.f58204h);
                int i12 = 0;
                while (true) {
                    float[] fArr = this.f58204h;
                    if (i12 < fArr.length) {
                        dArr2[i11][i12] = fArr[i12];
                        i12++;
                    }
                }
            }
            this.f54954a = v.b.a(i10, dArr, dArr2);
        }

        @Override // z.d
        public void h(View view, float f10) {
            this.f54954a.e(f10, this.f58204h);
            z.a.b((androidx.constraintlayout.widget.a) this.f58203g.valueAt(0), view, this.f58204h);
        }

        public void i(int i10, androidx.constraintlayout.widget.a aVar) {
            this.f58203g.append(i10, aVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class c extends d {
        c() {
        }

        @Override // z.d
        public void h(View view, float f10) {
            view.setElevation(a(f10));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class e extends d {
        e() {
        }

        @Override // z.d
        public void h(View view, float f10) {
            view.setPivotX(a(f10));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class f extends d {
        f() {
        }

        @Override // z.d
        public void h(View view, float f10) {
            view.setPivotY(a(f10));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class g extends d {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f58205f = false;

        g() {
        }

        @Override // z.d
        public void h(View view, float f10) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(a(f10));
                return;
            }
            if (this.f58205f) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f58205f = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(a(f10)));
                } catch (IllegalAccessException e10) {
                    Log.e("ViewSpline", "unable to setProgress", e10);
                } catch (InvocationTargetException e11) {
                    Log.e("ViewSpline", "unable to setProgress", e11);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class h extends d {
        h() {
        }

        @Override // z.d
        public void h(View view, float f10) {
            view.setRotation(a(f10));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class i extends d {
        i() {
        }

        @Override // z.d
        public void h(View view, float f10) {
            view.setRotationX(a(f10));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class j extends d {
        j() {
        }

        @Override // z.d
        public void h(View view, float f10) {
            view.setRotationY(a(f10));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class k extends d {
        k() {
        }

        @Override // z.d
        public void h(View view, float f10) {
            view.setScaleX(a(f10));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class l extends d {
        l() {
        }

        @Override // z.d
        public void h(View view, float f10) {
            view.setScaleY(a(f10));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class m extends d {
        m() {
        }

        @Override // z.d
        public void h(View view, float f10) {
            view.setTranslationX(a(f10));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class n extends d {
        n() {
        }

        @Override // z.d
        public void h(View view, float f10) {
            view.setTranslationY(a(f10));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class o extends d {
        o() {
        }

        @Override // z.d
        public void h(View view, float f10) {
            view.setTranslationZ(a(f10));
        }
    }

    public static d f(String str, SparseArray sparseArray) {
        return new b(str, sparseArray);
    }

    public static d g(String str) {
        str.getClass();
        switch (str) {
            case "rotationX":
                return new i();
            case "rotationY":
                return new j();
            case "translationX":
                return new m();
            case "translationY":
                return new n();
            case "translationZ":
                return new o();
            case "progress":
                return new g();
            case "scaleX":
                return new k();
            case "scaleY":
                return new l();
            case "waveVariesBy":
                return new a();
            case "transformPivotX":
                return new e();
            case "transformPivotY":
                return new f();
            case "rotation":
                return new h();
            case "elevation":
                return new c();
            case "transitionPathRotate":
                return new C0887d();
            case "alpha":
                return new a();
            case "waveOffset":
                return new a();
            default:
                return null;
        }
    }

    public abstract void h(View view, float f10);

    /* JADX INFO: renamed from: z.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class C0887d extends d {
        public void i(View view, float f10, double d10, double d11) {
            view.setRotation(a(f10) + ((float) Math.toDegrees(Math.atan2(d11, d10))));
        }

        @Override // z.d
        public void h(View view, float f10) {
        }
    }
}
