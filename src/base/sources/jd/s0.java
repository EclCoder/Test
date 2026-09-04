package jd;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface s0 {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class a {
        static a a(String str, q0 q0Var) {
            return new c(str, q0Var.b(), q0Var.a());
        }

        public static a b(String str) {
            return new c(str, null, null);
        }

        public abstract String c();

        public abstract String d();

        public abstract String e();
    }

    a a();
}
