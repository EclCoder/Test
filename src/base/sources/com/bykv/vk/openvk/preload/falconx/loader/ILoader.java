package com.bykv.vk.openvk.preload.falconx.loader;

import java.io.InputStream;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public interface ILoader {
    boolean exist(String str);

    Map<String, Long> getChannelVersion();

    InputStream getInputStream(String str);

    String getResRootDir();

    void release();
}
