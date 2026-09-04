package vg;

import com.hecorat.screenrecorder.free.R;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public enum h {
    EDIT_VIDEO("edit_video", R.string.edit_video, R.drawable.movie_edit_24, d.AMBER),
    EDIT_IMAGE("edit_image", R.string.edit_image, R.drawable.baseline_photo_size_select_large_24, d.PURPLE),
    STITCH_IMAGES("stitch_images", R.string.stitch_images, R.drawable.ic_stitch, d.GREEN),
    WIFI_TRANSFER("wifi_transfer", R.string.wifi_transfer, R.drawable.wifi_transfer, d.f55533l);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f55555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f55556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f55557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f55558d;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ ml.a f55554k = ml.b.a(d());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f55548e = new a(null);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a(String id2) {
            Object next;
            s.h(id2, "id");
            Iterator<E> it = h.h().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (s.c(((h) next).getId(), id2)) {
                    return (h) next;
                }
            }
            next = null;
            return (h) next;
        }

        private a() {
        }
    }

    h(String str, int i10, int i11, d dVar) {
        this.f55555a = str;
        this.f55556b = i10;
        this.f55557c = i11;
        this.f55558d = dVar;
    }

    public static ml.a h() {
        return f55554k;
    }

    public final d g() {
        return this.f55558d;
    }

    public final String getId() {
        return this.f55555a;
    }

    public final int i() {
        return this.f55557c;
    }

    public final int j() {
        return this.f55556b;
    }
}
