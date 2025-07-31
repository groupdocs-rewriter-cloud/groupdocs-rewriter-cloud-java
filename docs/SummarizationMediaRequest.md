

# SummarizationMediaRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**language** | **String** | Set language of text |  |
|**url** | **String** |  |  [optional] |
|**origin** | **String** | Information about SDK user, like a User-Agent |  [optional] |
|**originalName** | **String** |  |  [optional] |
|**savingMode** | **FileSavingMode** |  |  [optional] |
|**summarizationDegree** | **DegreeEnum** |  |  [optional] |
|**format** | **MediaInputFormat** |  |  |
|**outputformat** | [**OutputformatEnum**](#OutputformatEnum) | Output format, text or file |  |
|**minLength** | **Integer** | Minimum length of the original text to summarize |  [optional] |



## Enum: OutputformatEnum

| Name | Value |
|---- | -----|
| TEXT | &quot;Text&quot; |
| FILE | &quot;File&quot; |



