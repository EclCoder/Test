package z;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.dkl.hnj.gjv.hn.imh.UHbHibBvYxKnPE;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3.Annu.HqKnbV;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c extends v.e {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    static class a extends c {
        a() {
        }

        @Override // z.c
        public void j(View view, float f10) {
            view.setAlpha(a(f10));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    static class b extends c {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        float[] f58199h = new float[1];

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        protected androidx.constraintlayout.widget.a f58200i;

        b() {
        }

        @Override // v.e
        protected void c(Object obj) {
            this.f58200i = (androidx.constraintlayout.widget.a) obj;
        }

        @Override // z.c
        public void j(View view, float f10) {
            this.f58199h[0] = a(f10);
            z.a.b(this.f58200i, view, this.f58199h);
        }
    }

    /* JADX INFO: renamed from: z.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    static class C0886c extends c {
        C0886c() {
        }

        @Override // z.c
        public void j(View view, float f10) {
            view.setElevation(a(f10));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class e extends c {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f58201h = false;

        e() {
        }

        @Override // z.c
        public void j(View view, float f10) {
            Method method;
            String str = HqKnbV.Zmj;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(a(f10));
                return;
            }
            if (this.f58201h) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f58201h = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(a(f10)));
                } catch (IllegalAccessException e10) {
                    Log.e(str, "unable to setProgress", e10);
                } catch (InvocationTargetException e11) {
                    Log.e(str, "unable to setProgress", e11);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    static class f extends c {
        f() {
        }

        @Override // z.c
        public void j(View view, float f10) {
            view.setRotation(a(f10));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    static class g extends c {
        g() {
        }

        @Override // z.c
        public void j(View view, float f10) {
            view.setRotationX(a(f10));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    static class h extends c {
        h() {
        }

        @Override // z.c
        public void j(View view, float f10) {
            view.setRotationY(a(f10));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    static class i extends c {
        i() {
        }

        @Override // z.c
        public void j(View view, float f10) {
            view.setScaleX(a(f10));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    static class j extends c {
        j() {
        }

        @Override // z.c
        public void j(View view, float f10) {
            view.setScaleY(a(f10));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    static class k extends c {
        k() {
        }

        @Override // z.c
        public void j(View view, float f10) {
            view.setTranslationX(a(f10));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    static class l extends c {
        l() {
        }

        @Override // z.c
        public void j(View view, float f10) {
            view.setTranslationY(a(f10));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    static class m extends c {
        m() {
        }

        @Override // z.c
        public void j(View view, float f10) {
            view.setTranslationZ(a(f10));
        }
    }

    public abstract void j(View view, float f10);

    public static c i(String str) {
        if (str.startsWith("CUSTOM")) {
            return new b();
        }
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1249320806:
                if (str.equals("rotationX")) {
                    b10 = 0;
                }
                break;
            case -1249320805:
                if (str.equals(UHbHibBvYxKnPE.ueO)) {
                    b10 = 1;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    b10 = 2;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    b10 = 3;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    b10 = 4;
                }
                break;
            case -1001078227:
                if (str.equals(NotificationCompat.CATEGORY_PROGRESS)) {
                    b10 = 5;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    b10 = 6;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    b10 = 7;
                }
                break;
            case -797520672:
                if (str.equals("waveVariesBy")) {
                    b10 = 8;
                }
                break;
            case -40300674:
                if (str.equals("rotation")) {
                    b10 = 9;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    b10 = 10;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    b10 = 11;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    b10 = 12;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    b10 = 13;
                }
                break;
        }
        switch (b10) {
            case 0:
                return new g();
            case 1:
                return new h();
            case 2:
                return new k();
            case 3:
                return new l();
            case 4:
                return new m();
            case 5:
                return new e();
            case 6:
                return new i();
            case 7:
                return new j();
            case 8:
                return new a();
            case 9:
                return new f();
            case 10:
                return new C0886c();
            case 11:
                return new d();
            case 12:
                return new a();
            case 13:
                return new a();
            default:
                return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public static class d extends c {
        public void k(View view, float f10, double d10, double d11) {
            view.setRotation(a(f10) + ((float) Math.toDegrees(Math.atan2(d11, d10))));
        }

        @Override // z.c
        public void j(View view, float f10) {
        }
    }
}
