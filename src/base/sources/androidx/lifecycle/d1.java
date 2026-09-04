package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class d1 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(String str) {
        return "StateFlow and LiveData are mutually exclusive for the same key. Please use either 'getMutableStateFlow' or 'getLiveData' for key '" + str + "', but not both.";
    }
}
