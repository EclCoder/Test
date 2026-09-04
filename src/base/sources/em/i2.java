package em;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class i2 extends k0 {
    @Override // em.k0
    public k0 V0(int i10, String str) {
        jm.l.a(i10);
        return jm.l.b(this, str);
    }

    public abstract i2 X0();

    protected final String Y0() {
        i2 i2VarX0;
        i2 i2VarC = c1.c();
        if (this == i2VarC) {
            return "Dispatchers.Main";
        }
        try {
            i2VarX0 = i2VarC.X0();
        } catch (UnsupportedOperationException unused) {
            i2VarX0 = null;
        }
        if (this == i2VarX0) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }
}
