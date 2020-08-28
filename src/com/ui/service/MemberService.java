package com.ui.service;

import java.util.List;
import java.util.Map;

public interface MemberService {

	List<Map<String, Object>> selectMemberInfoList(Map<String,Object> mi);
}
