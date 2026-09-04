package eg;

import android.media.MediaFormat;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f37883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f37884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f37885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f37886d;

    public e(int i10, int i11, int i12, int i13) {
        this.f37883a = i10;
        this.f37884b = i11;
        this.f37885c = i12;
        this.f37886d = i13;
    }

    public int a() {
        return this.f37885c;
    }

    public int b() {
        return this.f37886d;
    }

    public int c() {
        return this.f37884b;
    }

    public int d() {
        return this.f37883a;
    }

    public MediaFormat e() {
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(MimeTypes.VIDEO_H264, this.f37883a, this.f37884b);
        mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
        mediaFormatCreateVideoFormat.setInteger("bitrate", this.f37885c);
        mediaFormatCreateVideoFormat.setInteger("frame-rate", this.f37886d);
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 1);
        return mediaFormatCreateVideoFormat;
    }

    public String toString() {
        return "VideoConfig{width=" + this.f37883a + ", height=" + this.f37884b + ", bitrate=" + this.f37885c + ", frameRate=" + this.f37886d + "}";
    }
}
