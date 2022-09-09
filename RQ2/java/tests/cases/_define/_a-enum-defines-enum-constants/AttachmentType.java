public enum AttachmentType  {
    
    /**
     * 服务器
     */
    LOCAL(0),

    /**
     * MINIO
     */
    MINIO(8);

    int num;
    
    public AttachmentType(int i){
        this.num = i;
    }
}