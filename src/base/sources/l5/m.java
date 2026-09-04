package l5;

import com.coremedia.iso.boxes.SubSampleInformationBox;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f43914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f43915b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f43916a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f43917b = false;

        /* synthetic */ a(d0 d0Var) {
        }

        public m a() {
            String str = this.f43916a;
            if (str == null) {
                throw new IllegalArgumentException("Product type must be set");
            }
            if (!this.f43917b || str.equals(SubSampleInformationBox.TYPE)) {
                return new m(this, null);
            }
            throw new IllegalArgumentException("includeSuspendedSubscriptions is only supported for subscription purchases");
        }

        public a b(String str) {
            this.f43916a = str;
            return this;
        }
    }

    /* synthetic */ m(a aVar, d0 d0Var) {
        this.f43914a = aVar.f43916a;
        this.f43915b = aVar.f43917b;
    }

    public static a b() {
        return new a(null);
    }

    public boolean a() {
        return this.f43915b;
    }

    public final String c() {
        return this.f43914a;
    }
}
