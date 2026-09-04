package okhttp3.internal.http2;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import on.a;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lokhttp3/internal/http2/StreamResetException;", "Ljava/io/IOException;", "Lon/a;", "errorCode", "<init>", "(Lon/a;)V", "a", "Lon/a;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StreamResetException extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final a errorCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamResetException(a errorCode) {
        super("stream was reset: " + errorCode);
        s.h(errorCode, "errorCode");
        this.errorCode = errorCode;
    }
}
