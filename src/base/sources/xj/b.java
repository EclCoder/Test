package xj;

import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class b implements a {
    @Override // xj.a
    public String getLanguage() {
        String language = Locale.getDefault().getLanguage();
        s.g(language, "getDefault().language");
        return language;
    }

    @Override // xj.a
    public String getTimeZoneId() {
        String id2 = TimeZone.getDefault().getID();
        s.g(id2, "getDefault().id");
        return id2;
    }
}
