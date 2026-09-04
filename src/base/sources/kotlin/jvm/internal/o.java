package kotlin.jvm.internal;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class o extends f implements n, zl.f {
    private final int arity;
    private final int flags;

    public o(int i10, Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.arity = i10;
        this.flags = i11 >> 1;
    }

    @Override // kotlin.jvm.internal.f
    protected zl.b computeReflected() {
        return l0.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            return getName().equals(oVar.getName()) && getSignature().equals(oVar.getSignature()) && this.flags == oVar.flags && this.arity == oVar.arity && s.c(getBoundReceiver(), oVar.getBoundReceiver()) && s.c(getOwner(), oVar.getOwner());
        }
        if (obj instanceof zl.f) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.n
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // zl.f
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // zl.f
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // zl.f
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // zl.f
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // zl.f
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        zl.b bVarCompute = compute();
        if (bVarCompute != this) {
            return bVarCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.f
    public zl.f getReflected() {
        return (zl.f) super.getReflected();
    }
}
