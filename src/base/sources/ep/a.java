package ep;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public abstract class a implements d, e {
    protected a() {
    }

    @Override // ep.d
    public d h(String str, int i10) {
        setParameter(str, Integer.valueOf(i10));
        return this;
    }

    @Override // ep.d
    public long i(String str, long j10) {
        Object parameter = getParameter(str);
        return parameter == null ? j10 : ((Long) parameter).longValue();
    }

    @Override // ep.d
    public d j(String str, boolean z10) {
        setParameter(str, z10 ? Boolean.TRUE : Boolean.FALSE);
        return this;
    }

    @Override // ep.d
    public boolean k(String str, boolean z10) {
        Object parameter = getParameter(str);
        return parameter == null ? z10 : ((Boolean) parameter).booleanValue();
    }

    @Override // ep.d
    public int l(String str, int i10) {
        Object parameter = getParameter(str);
        return parameter == null ? i10 : ((Integer) parameter).intValue();
    }

    @Override // ep.e
    public Set m() {
        throw new UnsupportedOperationException();
    }

    @Override // ep.d
    public d n(String str, long j10) {
        setParameter(str, Long.valueOf(j10));
        return this;
    }
}
