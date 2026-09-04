package z;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import v.o;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class f extends o {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a extends f {
        a() {
        }

        @Override // z.f
        public boolean i(View view, float f10, long j10, v.d dVar) {
            view.setAlpha(f(f10, j10, view, dVar));
            return this.f54995h;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class b extends f {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        String f58206l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        SparseArray f58207m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        SparseArray f58208n = new SparseArray();

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        float[] f58209o;

        public b(String str, SparseArray sparseArray) {
            this.f58206l = str.split(",")[1];
            this.f58207m = sparseArray;
        }

        @Override // v.o
        public void b(int i10, float f10, float f11, int i11, float f12) {
            throw new RuntimeException("Wrong call for custom attribute");
        }

        @Override // v.o
        public void e(int i10) {
            int size = this.f58207m.size();
            int iH = ((androidx.constraintlayout.widget.a) this.f58207m.valueAt(0)).h();
            double[] dArr = new double[size];
            int i11 = iH + 2;
            this.f58209o = new float[i11];
            this.f54994g = new float[iH];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i11);
            for (int i12 = 0; i12 < size; i12++) {
                int iKeyAt = this.f58207m.keyAt(i12);
                androidx.constraintlayout.widget.a aVar = (androidx.constraintlayout.widget.a) this.f58207m.valueAt(i12);
                float[] fArr = (float[]) this.f58208n.valueAt(i12);
                dArr[i12] = ((double) iKeyAt) * 0.01d;
                aVar.f(this.f58209o);
                int i13 = 0;
                while (true) {
                    float[] fArr2 = this.f58209o;
                    if (i13 < fArr2.length) {
                        dArr2[i12][i13] = fArr2[i13];
                        i13++;
                    }
                }
                double[] dArr3 = dArr2[i12];
                dArr3[iH] = fArr[0];
                dArr3[iH + 1] = fArr[1];
            }
            this.f54988a = v.b.a(i10, dArr, dArr2);
        }

        @Override // z.f
        public boolean i(View view, float f10, long j10, v.d dVar) {
            this.f54988a.e(f10, this.f58209o);
            float[] fArr = this.f58209o;
            float f11 = fArr[fArr.length - 2];
            float f12 = fArr[fArr.length - 1];
            long j11 = j10 - this.f54996i;
            if (Float.isNaN(this.f54997j)) {
                float fA = dVar.a(view, this.f58206l, 0);
                this.f54997j = fA;
                if (Float.isNaN(fA)) {
                    this.f54997j = 0.0f;
                }
            }
            float f13 = (float) ((((double) this.f54997j) + ((j11 * 1.0E-9d) * ((double) f11))) % 1.0d);
            this.f54997j = f13;
            this.f54996i = j10;
            float fA2 = a(f13);
            this.f54995h = false;
            int i10 = 0;
            while (true) {
                float[] fArr2 = this.f54994g;
                if (i10 >= fArr2.length) {
                    break;
                }
                boolean z10 = this.f54995h;
                float f14 = this.f58209o[i10];
                this.f54995h = z10 | (((double) f14) != 0.0d);
                fArr2[i10] = (f14 * fA2) + f12;
                i10++;
            }
            z.a.b((androidx.constraintlayout.widget.a) this.f58207m.valueAt(0), view, this.f54994g);
            if (f11 != 0.0f) {
                this.f54995h = true;
            }
            return this.f54995h;
        }

        public void j(int i10, androidx.constraintlayout.widget.a aVar, float f10, int i11, float f11) {
            this.f58207m.append(i10, aVar);
            this.f58208n.append(i10, new float[]{f10, f11});
            this.f54989b = Math.max(this.f54989b, i11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class c extends f {
        c() {
        }

        @Override // z.f
        public boolean i(View view, float f10, long j10, v.d dVar) {
            view.setElevation(f(f10, j10, view, dVar));
            return this.f54995h;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class d extends f {
        @Override // z.f
        public boolean i(View view, float f10, long j10, v.d dVar) {
            return this.f54995h;
        }

        public boolean j(View view, v.d dVar, float f10, long j10, double d10, double d11) {
            view.setRotation(f(f10, j10, view, dVar) + ((float) Math.toDegrees(Math.atan2(d11, d10))));
            return this.f54995h;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class e extends f {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        boolean f58210l = false;

        e() {
        }

        @Override // z.f
        public boolean i(View view, float f10, long j10, v.d dVar) {
            e eVar;
            Method method;
            if (view instanceof MotionLayout) {
                eVar = this;
                ((MotionLayout) view).setProgress(f(f10, j10, view, dVar));
            } else {
                eVar = this;
                if (eVar.f58210l) {
                    return false;
                }
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    eVar.f58210l = true;
                    method = null;
                }
                if (method != null) {
                    try {
                        method.invoke(view, Float.valueOf(eVar.f(f10, j10, view, dVar)));
                    } catch (IllegalAccessException e10) {
                        Log.e("ViewTimeCycle", "unable to setProgress", e10);
                    } catch (InvocationTargetException e11) {
                        Log.e("ViewTimeCycle", "unable to setProgress", e11);
                    }
                }
            }
            return eVar.f54995h;
        }
    }

    /* JADX INFO: renamed from: z.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class C0888f extends f {
        C0888f() {
        }

        @Override // z.f
        public boolean i(View view, float f10, long j10, v.d dVar) {
            view.setRotation(f(f10, j10, view, dVar));
            return this.f54995h;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class g extends f {
        g() {
        }

        @Override // z.f
        public boolean i(View view, float f10, long j10, v.d dVar) {
            view.setRotationX(f(f10, j10, view, dVar));
            return this.f54995h;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class h extends f {
        h() {
        }

        @Override // z.f
        public boolean i(View view, float f10, long j10, v.d dVar) {
            view.setRotationY(f(f10, j10, view, dVar));
            return this.f54995h;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class i extends f {
        i() {
        }

        @Override // z.f
        public boolean i(View view, float f10, long j10, v.d dVar) {
            view.setScaleX(f(f10, j10, view, dVar));
            return this.f54995h;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class j extends f {
        j() {
        }

        @Override // z.f
        public boolean i(View view, float f10, long j10, v.d dVar) {
            view.setScaleY(f(f10, j10, view, dVar));
            return this.f54995h;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class k extends f {
        k() {
        }

        @Override // z.f
        public boolean i(View view, float f10, long j10, v.d dVar) {
            view.setTranslationX(f(f10, j10, view, dVar));
            return this.f54995h;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class l extends f {
        l() {
        }

        @Override // z.f
        public boolean i(View view, float f10, long j10, v.d dVar) {
            view.setTranslationY(f(f10, j10, view, dVar));
            return this.f54995h;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class m extends f {
        m() {
        }

        @Override // z.f
        public boolean i(View view, float f10, long j10, v.d dVar) {
            view.setTranslationZ(f(f10, j10, view, dVar));
            return this.f54995h;
        }
    }

    public static f g(String str, SparseArray sparseArray) {
        return new b(str, sparseArray);
    }

    public static f h(String str, long j10) {
        f gVar;
        str.getClass();
        switch (str) {
            case "rotationX":
                gVar = new g();
                break;
            case "rotationY":
                gVar = new h();
                break;
            case "translationX":
                gVar = new k();
                break;
            case "translationY":
                gVar = new l();
                break;
            case "translationZ":
                gVar = new m();
                break;
            case "progress":
                gVar = new e();
                break;
            case "scaleX":
                gVar = new i();
                break;
            case "scaleY":
                gVar = new j();
                break;
            case "rotation":
                gVar = new C0888f();
                break;
            case "elevation":
                gVar = new c();
                break;
            case "transitionPathRotate":
                gVar = new d();
                break;
            case "alpha":
                gVar = new a();
                break;
            default:
                return null;
        }
        gVar.c(j10);
        return gVar;
    }

    public float f(float f10, long j10, View view, v.d dVar) {
        this.f54988a.e(f10, this.f54994g);
        float[] fArr = this.f54994g;
        float f11 = fArr[1];
        if (f11 == 0.0f) {
            this.f54995h = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f54997j)) {
            float fA = dVar.a(view, this.f54993f, 0);
            this.f54997j = fA;
            if (Float.isNaN(fA)) {
                this.f54997j = 0.0f;
            }
        }
        float f12 = (float) ((((double) this.f54997j) + (((j10 - this.f54996i) * 1.0E-9d) * ((double) f11))) % 1.0d);
        this.f54997j = f12;
        dVar.b(view, this.f54993f, 0, f12);
        this.f54996i = j10;
        float f13 = this.f54994g[0];
        float fA2 = (a(this.f54997j) * f13) + this.f54994g[2];
        this.f54995h = (f13 == 0.0f && f11 == 0.0f) ? false : true;
        return fA2;
    }

    public abstract boolean i(View view, float f10, long j10, v.d dVar);
}
