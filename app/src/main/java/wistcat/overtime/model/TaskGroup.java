package wistcat.overtime.model;

/**
 * 任务组
 *
 * @author wistcat 2016/8/31
 */
public class TaskGroup extends Entity {

    private final String mName;
    private final String mAccount;
    private int mTaskCount;
    private int mRunningCount;
    private String extra_1;
    private String extra_2;

    public TaskGroup(int id, int uuid, String name, String account) {
        super(id, uuid);
        mName = name;
        mAccount = account;
    }

    @Override
    public int getType() {
        return 0;
    }

    public String getName() {
        return mName;
    }

    public String getAccount() {
        return mAccount;
    }

    public int getTaskCount() {
        return mTaskCount;
    }

    public TaskGroup setCount(int count) {
        mTaskCount = count;
        return this;
    }

    public int getRunningCount() {
        return mRunningCount;
    }

    public TaskGroup setRunningCount(int count) {
        mRunningCount = count;
        return this;
    }

    public TaskGroup setExtra_1(String extra) {
        extra_1 = extra;
        return this;
    }

    public TaskGroup setExtra_2(String extra) {
        extra_2 = extra;
        return this;
    }

    public String getExtra_1() {
        return extra_1;
    }

    public String getExtra_2() {
        return extra_2;
    }

    public String toString() {
        return "_id:" + _id + " uuid:" + _uuid + " name:" + mName;
    }

}
