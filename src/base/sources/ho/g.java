package ho;

import com.google.api.client.http.UrlEncodedParser;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class g extends org.apache.http.entity.f {
    public g(Iterable iterable, Charset charset) {
        super(lo.e.g(iterable, charset != null ? charset : gp.e.f39837a), org.apache.http.entity.d.c(UrlEncodedParser.CONTENT_TYPE, charset));
    }
}
