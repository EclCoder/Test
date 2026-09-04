package ng;

import android.net.Uri;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f47689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f47690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f47691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f47692d;

    public c(Uri uri, String path, String str, String name) {
        s.h(uri, "uri");
        s.h(path, "path");
        s.h(name, "name");
        this.f47689a = uri;
        this.f47690b = path;
        this.f47691c = str;
        this.f47692d = name;
    }

    public abstract String a();

    public abstract Uri b();
}
