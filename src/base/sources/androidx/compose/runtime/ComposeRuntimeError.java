package androidx.compose.runtime;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002R\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/runtime/ComposeRuntimeError;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "", "a", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", PglCryptUtils.KEY_MESSAGE, "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ComposeRuntimeError extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String message;

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }
}
