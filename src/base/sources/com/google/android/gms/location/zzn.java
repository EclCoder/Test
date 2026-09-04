package com.google.android.gms.location;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzn implements Comparator<ActivityTransition> {
    zzn() {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(ActivityTransition activityTransition, ActivityTransition activityTransition2) {
        ActivityTransition activityTransition3 = activityTransition;
        ActivityTransition activityTransition4 = activityTransition2;
        Preconditions.checkNotNull(activityTransition3);
        Preconditions.checkNotNull(activityTransition4);
        int activityType = activityTransition3.getActivityType();
        int activityType2 = activityTransition4.getActivityType();
        if (activityType != activityType2) {
            return activityType >= activityType2 ? 1 : -1;
        }
        int transitionType = activityTransition3.getTransitionType();
        int transitionType2 = activityTransition4.getTransitionType();
        if (transitionType == transitionType2) {
            return 0;
        }
        return transitionType < transitionType2 ? -1 : 1;
    }
}
