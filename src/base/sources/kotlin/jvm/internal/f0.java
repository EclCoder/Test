package kotlin.jvm.internal;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f0 extends f implements zl.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f43586a;

    public f0(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.f43586a = (i10 & 2) == 2;
    }

    @Override // kotlin.jvm.internal.f
    public zl.b compute() {
        return this.f43586a ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0) {
            f0 f0Var = (f0) obj;
            return getOwner().equals(f0Var.getOwner()) && getName().equals(f0Var.getName()) && getSignature().equals(f0Var.getSignature()) && s.c(getBoundReceiver(), f0Var.getBoundReceiver());
        }
        if (obj instanceof zl.k) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.f
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public zl.k getReflected() {
        if (this.f43586a) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        return (zl.k) super.getReflected();
    }

    public String toString() {
        zl.b bVarCompute = compute();
        if (bVarCompute != this) {
            return bVarCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
