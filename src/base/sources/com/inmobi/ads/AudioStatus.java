package com.inmobi.ads;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/inmobi/ads/AudioStatus;", "", "<init>", "(Ljava/lang/String;I)V", "PLAYING", "PAUSED", "COMPLETED", "Companion", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum AudioStatus {
    PLAYING,
    PAUSED,
    COMPLETED;

    private static final /* synthetic */ ml.a $ENTRIES = ml.b.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/inmobi/ads/AudioStatus$Companion;", "", "Lcom/inmobi/ads/AudioStatus;", "", "<init>", "()V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "from", "(I)Lcom/inmobi/ads/AudioStatus;", "item", "to", "(Lcom/inmobi/ads/AudioStatus;)Ljava/lang/Integer;", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public /* bridge */ /* synthetic */ Object from(Object obj) {
            return from(((Number) obj).intValue());
        }

        private Companion() {
        }

        public AudioStatus from(int value) {
            if (value != 0) {
                return value != 1 ? AudioStatus.COMPLETED : AudioStatus.PAUSED;
            }
            return AudioStatus.PLAYING;
        }

        public Integer to(AudioStatus item) {
            s.h(item, "item");
            return Integer.valueOf(item.ordinal());
        }
    }

    public static AudioStatus from(int i10) {
        return INSTANCE.from(i10);
    }

    public static ml.a getEntries() {
        return $ENTRIES;
    }

    public static int to(AudioStatus audioStatus) {
        return INSTANCE.to(audioStatus).intValue();
    }
}
