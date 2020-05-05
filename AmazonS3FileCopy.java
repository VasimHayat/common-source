public static void copyFile() {
		String bucketName = "";
		String clientRegion = "us-west-1";
		String accessKey = "";
		String secretKey = "";

		String sourcePath = "demo/HW_03/001/Enity.png";
		String destPath = "demo/HW_03/002/Enity.png";

		try {

			AWSCredentials credentials = new BasicAWSCredentials(accessKey, secretKey);

			AmazonS3 s3Client = AmazonS3ClientBuilder.standard().withRegion(clientRegion).withCredentials(new AWSStaticCredentialsProvider(credentials)).build();

			CopyObjectResult res = s3Client.copyObject(bucketName, sourcePath, bucketName, destPath);
			System.out.println(res);
			System.out.println("EEEEEEEEEEEEEEEEEEEEEE");
		} catch (Exception e) {
			e.printStackTrace();
			FNExceptionUtil.logException("Error in Copying file to  ", e);
		}

	}
