package vg;

import com.hecorat.screenrecorder.free.R;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public enum b {
    AUTO_CAPTION("auto_caption", "video.risenapps.video.subtitle.caption", R.string.dedicated_auto_caption_name, R.string.dedicated_auto_caption_share_subtitle, R.drawable.ic_dedicated_auto_caption_app),
    VIDEO_COMPRESSOR("video_compressor", "video.compressor.compress.video.size", R.string.dedicated_video_compressor_name, R.string.dedicated_video_compressor_share_subtitle, R.drawable.ic_dedicated_video_compressor_app);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f55518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f55519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f55520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f55521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f55522e;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ ml.a f55517j = ml.b.a(d());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f55513f = new a(null);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(String str) {
            Object next;
            Iterator<E> it = b.h().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (s.c(((b) next).getId(), str)) {
                    return (b) next;
                }
            }
            next = null;
            return (b) next;
        }

        private a() {
        }
    }

    b(String str, String str2, int i10, int i11, int i12) {
        this.f55518a = str;
        this.f55519b = str2;
        this.f55520c = i10;
        this.f55521d = i11;
        this.f55522e = i12;
    }

    public static ml.a h() {
        return f55517j;
    }

    public final int g() {
        return this.f55520c;
    }

    public final String getId() {
        return this.f55518a;
    }

    public final int i() {
        return this.f55522e;
    }

    public final String j() {
        return this.f55519b;
    }

    public final int k() {
        return this.f55521d;
    }
}
