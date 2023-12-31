package kr.pe.eta.service.community;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import kr.pe.eta.common.Search;
import kr.pe.eta.domain.Call;
import kr.pe.eta.domain.DealReq;
import kr.pe.eta.domain.ShareReq;
import kr.pe.eta.domain.ShareReqPassenger;

@Mapper
public interface CommunityDao {

	public void addReservation(Call call) throws Exception;

	public int getCallNo(Map param) throws Exception;

	public Call getCall(int callNo) throws Exception;

	public void addDealReq(DealReq dealReq) throws Exception;

	public void deleteDealReq(int callNo) throws Exception;

	public DealReq getDeal(int dealNo) throws Exception;

	public List<DealReq> getDealDriverList(Map param) throws Exception;

	public List<DealReq> getDealList(Search search) throws Exception;

	public int getTotalCountPass(Search search) throws Exception;

	public int getTotalCountDriver(int call_no) throws Exception;

	public void addShareReq(ShareReq shareReq) throws Exception;

	public void addShareReqOther(ShareReqPassenger shareReqPassenger) throws Exception;

	public void deleteShareReq(int userNo) throws Exception;

	public List<DealReq> getShareList(Search search) throws Exception;

	public void updateDealCode(int userNo) throws Exception;

	public void updateShareCode(int userNo) throws Exception;
}
