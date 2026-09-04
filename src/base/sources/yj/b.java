package yj;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public enum b {
    UNKNOWN("unknown"),
    OPT_IN("opted_in"),
    OPT_OUT("opted_out");

    private final String value;

    b(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
