package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.ParserException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class UnrecognizedInputFormatException extends ParserException {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f5802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.google.common.collect.c0 f5803d;

    public UnrecognizedInputFormatException(String str, Uri uri, List list) {
        super(str, null, false, 1);
        this.f5802c = uri;
        this.f5803d = com.google.common.collect.c0.x(list);
    }
}
