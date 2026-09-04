package zl;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f58989c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m f58990d = new m(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f58991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f58992b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final m a(l type) {
            s.h(type, "type");
            return new m(n.INVARIANT, type);
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f58993a;

        static {
            int[] iArr = new int[n.values().length];
            try {
                iArr[n.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f58993a = iArr;
        }
    }

    public m(n nVar, l lVar) {
        String str;
        this.f58991a = nVar;
        this.f58992b = lVar;
        if ((nVar == null) == (lVar == null)) {
            return;
        }
        if (nVar == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + nVar + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public final l a() {
        return this.f58992b;
    }

    public final n b() {
        return this.f58991a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f58991a == mVar.f58991a && s.c(this.f58992b, mVar.f58992b);
    }

    public int hashCode() {
        n nVar = this.f58991a;
        int iHashCode = (nVar == null ? 0 : nVar.hashCode()) * 31;
        l lVar = this.f58992b;
        return iHashCode + (lVar != null ? lVar.hashCode() : 0);
    }

    public String toString() {
        n nVar = this.f58991a;
        int i10 = nVar == null ? -1 : b.f58993a[nVar.ordinal()];
        if (i10 == -1) {
            return "*";
        }
        if (i10 == 1) {
            return String.valueOf(this.f58992b);
        }
        if (i10 == 2) {
            return "in " + this.f58992b;
        }
        if (i10 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return "out " + this.f58992b;
    }
}
