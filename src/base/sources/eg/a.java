package eg;

import android.media.MediaFormat;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f37851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f37852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f37853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f37854d;

    public a(String str, int i10, int i11, int i12) {
        this.f37851a = str;
        this.f37852b = i10;
        this.f37853c = i11;
        this.f37854d = i12;
    }

    public int a() {
        return this.f37852b;
    }

    public int b() {
        return this.f37854d;
    }

    public int c() {
        return this.f37853c;
    }

    public String d() {
        return this.f37851a;
    }

    public MediaFormat e() {
        MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat(MimeTypes.AUDIO_AAC, this.f37853c, this.f37854d);
        mediaFormatCreateAudioFormat.setInteger("aac-profile", 2);
        mediaFormatCreateAudioFormat.setInteger("bitrate", this.f37852b);
        return mediaFormatCreateAudioFormat;
    }

    public String toString() {
        return "AudioConfig{source: " + this.f37851a + "bitRate=" + this.f37852b + ", sampleRate=" + this.f37853c + ", channelCount=" + this.f37854d + '}';
    }
}
