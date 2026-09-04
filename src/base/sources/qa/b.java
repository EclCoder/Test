package qa;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.d;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d.a f50513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f50514b;

    public b(d.a aVar, List list) {
        this.f50513a = aVar;
        this.f50514b = list;
    }

    @Override // com.google.android.exoplayer2.upstream.d.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a parse(Uri uri, InputStream inputStream) {
        a aVar = (a) this.f50513a.parse(uri, inputStream);
        List list = this.f50514b;
        return (list == null || list.isEmpty()) ? aVar : (a) aVar.copy(this.f50514b);
    }
}
