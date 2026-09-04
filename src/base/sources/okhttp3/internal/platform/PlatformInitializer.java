package okhttp3.internal.platform;

import android.content.Context;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import gl.r;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lokhttp3/internal/platform/PlatformInitializer;", "Lr4/a;", "Lokhttp3/internal/platform/c;", "<init>", "()V", "Landroid/content/Context;", "context", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "(Landroid/content/Context;)Lokhttp3/internal/platform/c;", "", "Ljava/lang/Class;", "a", "()Ljava/util/List;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PlatformInitializer implements r4.a {
    @Override // r4.a
    public List a() {
        return r.l();
    }

    @Override // r4.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c create(Context context) {
        s.h(context, "context");
        d.f48995a.d(context);
        return c.f48992a.e();
    }
}
