package com.facebook.bolts;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0005\u0018\u0000 \u000f2\u00060\u0001j\u0002`\u0002:\u0001\fJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0006\u0010\tR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/facebook/bolts/AggregateException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Ljava/io/PrintStream;", NotificationCompat.CATEGORY_ERROR, "Lfl/g0;", "printStackTrace", "(Ljava/io/PrintStream;)V", "Ljava/io/PrintWriter;", "(Ljava/io/PrintWriter;)V", "", "", "a", "Ljava/util/List;", "innerThrowables", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "facebook-bolts_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AggregateException extends Exception {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List innerThrowables;

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream err) {
        s.h(err, "err");
        super.printStackTrace(err);
        int i10 = -1;
        for (Throwable th2 : this.innerThrowables) {
            err.append("\n");
            err.append("  Inner throwable #");
            i10++;
            err.append((CharSequence) String.valueOf(i10));
            err.append(": ");
            if (th2 != null) {
                th2.printStackTrace(err);
            }
            err.append("\n");
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter err) {
        s.h(err, "err");
        super.printStackTrace(err);
        int i10 = -1;
        for (Throwable th2 : this.innerThrowables) {
            err.append("\n");
            err.append("  Inner throwable #");
            i10++;
            err.append((CharSequence) String.valueOf(i10));
            err.append(": ");
            if (th2 != null) {
                th2.printStackTrace(err);
            }
            err.append("\n");
        }
    }
}
