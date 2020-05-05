public static void copyFile() {
		String bucketName = "cdnhubworks";
		String clientRegion = "us-west-1";
		String accessKey = "AKIAJ37JC6KOWBOHDXXA";
		String secretKey = "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";

		String sourcePath = "hw-img/DEV/Mohammad Vasim/HW_03/24902/EOCustTaskSetup_5273_1.png";
		String destPath = "hw-img/DEV/Mohammad Vasim/HW_03/24902_2/EOCustTaskSetup_5441_0.png";

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
