package com.kongzue.baseframework.interfaces;

import android.view.View;

import com.kongzue.baseframework.BaseAdapter;

import java.util.List;
import java.util.Map;

public interface MultipleAdapterSettings {
    Object setViewHolder(int type, View convertView);
    
    void setData(int type, Object viewHolder, BaseAdapter.BaseDataBean dataBean);
}