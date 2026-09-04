package d6;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class e extends b6.e implements t5.b {
    public e(c cVar) {
        super(cVar);
    }

    @Override // t5.c
    public void a() {
        ((c) this.f8491a).stop();
        ((c) this.f8491a).k();
    }

    @Override // t5.c
    public Class b() {
        return c.class;
    }

    @Override // t5.c
    public int getSize() {
        return ((c) this.f8491a).i();
    }

    @Override // b6.e, t5.b
    public void initialize() {
        ((c) this.f8491a).e().prepareToDraw();
    }
}
