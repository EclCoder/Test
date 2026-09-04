package r5;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public interface e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f51095a = Charset.forName(C.UTF8_NAME);

    void a(MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}
