package yj;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public enum a {
    COPPA_ENABLED(Boolean.TRUE),
    COPPA_DISABLED(Boolean.FALSE),
    COPPA_NOTSET(null);

    private final Boolean value;

    a(Boolean bool) {
        this.value = bool;
    }

    public final Boolean getValue() {
        return this.value;
    }
}
