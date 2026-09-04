package cm;

import com.googlecode.mp4parser.boxes.microsoft.lIu.trPLwhKZgZ;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
abstract class f extends e {
    public static final d e(String shortName) {
        s.h(shortName, "shortName");
        int iHashCode = shortName.hashCode();
        if (iHashCode != 100) {
            if (iHashCode != 104) {
                if (iHashCode != 109) {
                    if (iHashCode != 115) {
                        if (iHashCode != 3494) {
                            if (iHashCode != 3525) {
                                if (iHashCode == 3742 && shortName.equals("us")) {
                                    return d.MICROSECONDS;
                                }
                            } else if (shortName.equals("ns")) {
                                return d.NANOSECONDS;
                            }
                        } else if (shortName.equals("ms")) {
                            return d.MILLISECONDS;
                        }
                    } else if (shortName.equals("s")) {
                        return d.SECONDS;
                    }
                } else if (shortName.equals("m")) {
                    return d.MINUTES;
                }
            } else if (shortName.equals("h")) {
                return d.HOURS;
            }
        } else if (shortName.equals(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D)) {
            return d.DAYS;
        }
        throw new IllegalArgumentException("Unknown duration unit short name: " + shortName);
    }

    public static final d d(char c10, boolean z10) {
        if (!z10) {
            if (c10 == 'D') {
                return d.DAYS;
            }
            throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + c10);
        }
        if (c10 == 'H') {
            return d.HOURS;
        }
        if (c10 == 'M') {
            return d.MINUTES;
        }
        if (c10 == 'S') {
            return d.SECONDS;
        }
        throw new IllegalArgumentException(trPLwhKZgZ.ptHHgKLdyDQkmzC + c10);
    }
}
