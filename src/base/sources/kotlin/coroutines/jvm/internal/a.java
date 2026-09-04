package kotlin.coroutines.jvm.internal;

import fl.r;
import java.io.Serializable;
import kotlin.jvm.internal.s;
import ta.QXA.YSHErhbVu;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements kl.f, e, Serializable {
    private final kl.f completion;

    public a(kl.f fVar) {
        this.completion = fVar;
    }

    public kl.f create(kl.f completion) {
        s.h(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public e getCallerFrame() {
        kl.f fVar = this.completion;
        if (fVar instanceof e) {
            return (e) fVar;
        }
        return null;
    }

    public final kl.f getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        return g.c(this);
    }

    protected abstract Object invokeSuspend(Object obj);

    protected void releaseIntercepted() {
    }

    @Override // kl.f
    public final void resumeWith(Object obj) {
        kl.f fVar = this;
        while (true) {
            h.b(fVar);
            a aVar = (a) fVar;
            kl.f fVar2 = aVar.completion;
            s.e(fVar2);
            try {
                Object objInvokeSuspend = aVar.invokeSuspend(obj);
                if (objInvokeSuspend == ll.b.f()) {
                    return;
                } else {
                    obj = r.b(objInvokeSuspend);
                }
            } catch (Throwable th2) {
                r.a aVar2 = r.f38769b;
                obj = r.b(fl.s.a(th2));
            }
            aVar.releaseIntercepted();
            if (!(fVar2 instanceof a)) {
                fVar2.resumeWith(obj);
                return;
            }
            fVar = fVar2;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb2.append(stackTraceElement);
        return sb2.toString();
    }

    public kl.f create(Object obj, kl.f fVar) {
        s.h(fVar, YSHErhbVu.TuKzcApIvICm);
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
