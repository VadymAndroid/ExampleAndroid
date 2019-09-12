package android.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new ua.mycredit.mycredit.DataBinderMapperImpl());
  }
}
