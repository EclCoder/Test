package em;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f37972b = AtomicIntegerFieldUpdater.newUpdater(d0.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f37973a;

    public d0(Throwable th2, boolean z10) {
        this.f37973a = th2;
        this._handled$volatile = z10 ? 1 : 0;
    }

    public final boolean a() {
        return f37972b.get(this) == 1;
    }

    public final boolean c() {
        return f37972b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return s0.a(this) + '[' + this.f37973a + ']';
    }

    public /* synthetic */ d0(Throwable th2, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(th2, (i10 & 2) != 0 ? false : z10);
    }
}
