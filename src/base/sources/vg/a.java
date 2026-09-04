package vg;

import com.hecorat.screenrecorder.free.R;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public enum a {
    AUTO_CAPTION("auto_caption", "video.risenapps.video.subtitle.caption", R.string.auto_caption, R.drawable.ic_closed_caption_24, d.PINK),
    AUDIO_BOOSTER("audio_booster", "volumebooster.soundbooster.fxsound", R.string.audio_booster, R.drawable.outline_brand_awareness_24, d.CORAL),
    COMPRESS_VIDEO("compress_video", "video.compressor.compress.video.size", R.string.compress_video, R.drawable.ic_compress_white_24dp, d.BLUE),
    FILE_RECOVERY("file_recovery", "com.hecorat.recovery", R.string.file_recovery, R.drawable.outline_restore_from_trash_24, d.INDIGO),
    VIDEO_DOWNLOADER("video_downloader", "video.downloader.videodownloaders", R.string.video_downloader, R.drawable.baseline_download_24, d.YELLOW),
    SCREEN_MIRRORING("screen_mirroring", "screen.mirroring.cast.screenmirroring", R.string.screen_mirroring, R.drawable.ic_screen_mirroring_24, d.DEEP_PURPLE);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f55508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f55509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f55510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f55511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d f55512e;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ ml.a f55507n = ml.b.a(d());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0839a f55499f = new C0839a(null);

    /* JADX INFO: renamed from: vg.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0839a {
        public /* synthetic */ C0839a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(String id2) {
            Object next;
            s.h(id2, "id");
            Iterator<E> it = a.h().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (s.c(((a) next).getId(), id2)) {
                    return (a) next;
                }
            }
            next = null;
            return (a) next;
        }

        private C0839a() {
        }
    }

    a(String str, String str2, int i10, int i11, d dVar) {
        this.f55508a = str;
        this.f55509b = str2;
        this.f55510c = i10;
        this.f55511d = i11;
        this.f55512e = dVar;
    }

    public static ml.a h() {
        return f55507n;
    }

    public final d g() {
        return this.f55512e;
    }

    public final String getId() {
        return this.f55508a;
    }

    public final int i() {
        return this.f55511d;
    }

    public final String j() {
        return this.f55509b;
    }

    public final int k() {
        return this.f55510c;
    }
}
