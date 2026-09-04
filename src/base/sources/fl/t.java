package fl;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class t implements k, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f38772d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f38773e = AtomicReferenceFieldUpdater.newUpdater(t.class, Object.class, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile tl.a f38774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f38775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f38776c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public t(tl.a initializer) {
        kotlin.jvm.internal.s.h(initializer, "initializer");
        this.f38774a = initializer;
        d0 d0Var = d0.f38744a;
        this.f38775b = d0Var;
        this.f38776c = d0Var;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new h(getValue());
    }

    @Override // fl.k
    public Object getValue() {
        Object obj = this.f38775b;
        d0 d0Var = d0.f38744a;
        if (obj != d0Var) {
            return obj;
        }
        tl.a aVar = this.f38774a;
        if (aVar != null) {
            Object objInvoke = aVar.invoke();
            if (androidx.concurrent.futures.b.a(f38773e, this, d0Var, objInvoke)) {
                this.f38774a = null;
                return objInvoke;
            }
        }
        return this.f38775b;
    }

    @Override // fl.k
    public boolean isInitialized() {
        return this.f38775b != d0.f38744a;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
