package jm;

import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.internal.UndeliveredElementException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class w {
    public static final void a(Function1 function1, Object obj, kl.j jVar) {
        UndeliveredElementException undeliveredElementExceptionB = b(function1, obj, null);
        if (undeliveredElementExceptionB != null) {
            em.m0.a(jVar, undeliveredElementExceptionB);
        }
    }

    public static final UndeliveredElementException b(Function1 function1, Object obj, UndeliveredElementException undeliveredElementException) {
        try {
            function1.invoke(obj);
            return undeliveredElementException;
        } catch (Throwable th2) {
            if (undeliveredElementException != null && undeliveredElementException.getCause() != th2) {
                fl.e.a(undeliveredElementException, th2);
                return undeliveredElementException;
            }
            return new UndeliveredElementException("Exception in undelivered element handler for " + obj, th2);
        }
    }

    public static /* synthetic */ UndeliveredElementException c(Function1 function1, Object obj, UndeliveredElementException undeliveredElementException, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            undeliveredElementException = null;
        }
        return b(function1, obj, undeliveredElementException);
    }
}
