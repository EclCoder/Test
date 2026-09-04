package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f implements zl.b, Serializable {
    public static final Object NO_RECEIVER = a.f43585a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient zl.b reflected;
    private final String signature;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class a implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final a f43585a = new a();

        private a() {
        }

        private Object readResolve() {
            return f43585a;
        }
    }

    protected f(Object obj, Class cls, String str, String str2, boolean z10) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z10;
    }

    @Override // zl.b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // zl.b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public zl.b compute() {
        zl.b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        zl.b bVarComputeReflected = computeReflected();
        this.reflected = bVarComputeReflected;
        return bVarComputeReflected;
    }

    protected abstract zl.b computeReflected();

    @Override // zl.a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public zl.e getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? l0.c(cls) : l0.b(cls);
    }

    @Override // zl.b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    protected zl.b getReflected() {
        zl.b bVarCompute = compute();
        if (bVarCompute != this) {
            return bVarCompute;
        }
        throw new sl.b();
    }

    @Override // zl.b
    public zl.l getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // zl.b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // zl.b
    public zl.o getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // zl.b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // zl.b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // zl.b
    public boolean isOpen() {
        return getReflected().isOpen();
    }
}
