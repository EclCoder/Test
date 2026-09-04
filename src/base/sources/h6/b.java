package h6;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f40244a = new ArrayList();

    public synchronized void a(ImageHeaderParser imageHeaderParser) {
        this.f40244a.add(imageHeaderParser);
    }

    public synchronized List b() {
        return this.f40244a;
    }
}
