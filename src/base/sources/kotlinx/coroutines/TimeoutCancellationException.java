package kotlinx.coroutines;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import em.z1;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B\u001b\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/TimeoutCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "", "", PglCryptUtils.KEY_MESSAGE, "Lem/z1;", "coroutine", "<init>", "(Ljava/lang/String;Lem/z1;)V", "(Ljava/lang/String;)V", "a", "Lem/z1;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TimeoutCancellationException extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final transient z1 coroutine;

    public TimeoutCancellationException(String str, z1 z1Var) {
        super(str);
        this.coroutine = z1Var;
    }

    public TimeoutCancellationException(String str) {
        this(str, null);
    }
}
