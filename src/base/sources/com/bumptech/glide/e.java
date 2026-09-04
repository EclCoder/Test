package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class e extends ContextWrapper {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final m f11165k = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u5.b f11166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m6.f.b f11167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j6.g f11168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c.b f11169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f11170e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f11171f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.j f11172g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final f f11173h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f11174i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private i6.f f11175j;

    public e(Context context, u5.b bVar, m6.f.b bVar2, j6.g gVar, c.b bVar3, Map map, List list, com.bumptech.glide.load.engine.j jVar, f fVar, int i10) {
        super(context.getApplicationContext());
        this.f11166a = bVar;
        this.f11168c = gVar;
        this.f11169d = bVar3;
        this.f11170e = list;
        this.f11171f = map;
        this.f11172g = jVar;
        this.f11173h = fVar;
        this.f11174i = i10;
        this.f11167b = m6.f.a(bVar2);
    }

    public j6.j a(ImageView imageView, Class cls) {
        return this.f11168c.a(imageView, cls);
    }

    public u5.b b() {
        return this.f11166a;
    }

    public List c() {
        return this.f11170e;
    }

    public synchronized i6.f d() {
        try {
            if (this.f11175j == null) {
                this.f11175j = (i6.f) this.f11169d.build().Q();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f11175j;
    }

    public m e(Class cls) {
        m mVar = (m) this.f11171f.get(cls);
        if (mVar == null) {
            for (Map.Entry entry : this.f11171f.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    mVar = (m) entry.getValue();
                }
            }
        }
        return mVar == null ? f11165k : mVar;
    }

    public com.bumptech.glide.load.engine.j f() {
        return this.f11172g;
    }

    public f g() {
        return this.f11173h;
    }

    public int h() {
        return this.f11174i;
    }

    public Registry i() {
        return (Registry) this.f11167b.get();
    }
}
