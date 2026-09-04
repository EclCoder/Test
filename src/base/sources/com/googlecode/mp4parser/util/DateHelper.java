package com.googlecode.mp4parser.util;

import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class DateHelper {
    public static Date convert(long j10) {
        return new Date((j10 - 2082844800) * 1000);
    }

    public static long convert(Date date) {
        return (date.getTime() / 1000) + 2082844800;
    }
}
